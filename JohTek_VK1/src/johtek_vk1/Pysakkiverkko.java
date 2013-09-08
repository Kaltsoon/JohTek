package johtek_vk1;

import Structures.Graph.Graph;
import Structures.Graph.Vertex;
import java.util.HashMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import com.google.gson.*;

/**
 * Luokka pysäkkiverkon kuvaamiseen ja sen tietojen lukemiseen JSON-tiedostosta
 */
public class Pysakkiverkko {

    /** 
     * Kaikki pysakit taulukossa. 
     * 
     * 	Pari huomioita pysakkien muodostamasta verkosta: 
     *  1.) verkko on osittain suunnattu, eli jossain kohdissa pysakkien valin
     *  paasee kulkemaan vain toiseen suuntaan.
     *  
      */
    private Pysakki[] pysakit;
    
    /** Pysakit key: koodi value: olio hakupareina. Oliot ovat samat kuin 
     *  pysakit-taulukossa. 
     * */
    private HashMap<String, Pysakki> psMap;
    private Graph verkko;
    private HashMap<String, Vertex> solmuMap;
    /** 
     * Konstruktori. Lukee verkkoa kuvaavan JSON-tiedoston ja luo sen pohjalta 
     * Pysakki-olioiden verkon.
     * 
     * @param filePath polku tiedostoon (sis. tiedoston nimen)
     */
    public Pysakkiverkko(String filePath) {
        this.solmuMap=new HashMap<String,Vertex>();
        JsonArray psArr = readJSON(filePath);
        Gson gson = new Gson();
        this.pysakit = new Pysakki[psArr.size()];
        for (int i = 0; i < psArr.size(); i++) {
            this.pysakit[i] = gson.fromJson(psArr.get(i), Pysakki.class);
        }
        this.psMap = new HashMap<String, Pysakki>();
        for (Pysakki p : pysakit) {
            this.psMap.put(p.getKoodi(), p);
        }
        luoKaaret();
    }
    private void luoKaaret(){
        for (String koodi : psMap.keySet()) {
            Vertex solmu = new Vertex("["+this.psMap.get(koodi).getKoodi()+"] " + this.psMap.get(koodi).getNimi());
            solmu.setData(this.psMap.get(koodi));
            this.solmuMap.put(koodi, solmu);
        }
        this.verkko=new Graph();
        for (String koodi : psMap.keySet()) {
            Vertex solmu = this.solmuMap.get(koodi);
            for ( String naapuriKoodi : this.psMap.get(koodi).getNaapurit()) {
                Vertex vierusSolmu = this.solmuMap.get(naapuriKoodi);
                this.verkko.connect(solmu, vierusSolmu);
            }
        }
    }
    public void lyhyinReitti(String aloitus, String maaranpaa){
        System.out.println(this.verkko.shortestPath(this.solmuMap.get(aloitus), this.solmuMap.get(maaranpaa)));
    }
    /**
     * Palauttaa pysäkkikoodia vastaavan Pysäkki-olion viitteen
     * 
     * @param koodi pysäkin tunniste
     * @return tunnistetta vastaava pysäkki
     */
    public Pysakki getPysakki(String koodi) {
        
        return psMap.get(koodi);
    }

    /**
     * Palauttaa verkon pysäkit.
     * 
     * @return Pysäkki-oliot
     */
    public Pysakki[] getPysakkilista() {
        
        return pysakit.clone();
    }

    /**
     * Lukee annetun tiedoston palautettavaan Stringiin
     * @param filePath tiedoston sijainti
     * @return tiedoston sisältö merkkijonona
     */
    private static String readFileAsString(String filePath) throws IOException {
        
        byte[] buffer = new byte[(int) new File(filePath).length()];
        BufferedInputStream f = null;
        try {
            f = new BufferedInputStream(new FileInputStream(filePath));
            f.read(buffer);
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ignored) {
                }
            }
        }
        return new String(buffer);
    }

    /** 
     * Parsii annetusta tiedostosta JSON-taulukon.
     *
     * @param filePath tiedostopolku luettavaan tiedostoon
     * @return JsonArray, joka edustaa tiedostosta luettuja JSON-olioita.
     */
    private static JsonArray readJSON(String filePath) {

        JsonParser parser = new JsonParser();
        String json = "";
        try {
            json = readFileAsString(filePath);
        } catch (Exception e) {
        }
        JsonArray arr = parser.parse(json).getAsJsonArray();
        return arr;
    }
}

