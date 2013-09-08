package johtek_vk1;

import java.util.HashMap;

/**
 * Luokka pysäkkiverkon solmun tietojen tallennukseen. 
 */
public class Pysakki {

    private String koodi;
    private String osoite;
    private String nimi;
    private int x;
    private int y;
    private HashMap<String, String[]> naapurit;

    /**
     * Konstruktori, joka luo tyhjän olion.
     */
    public Pysakki() {
        
        this.koodi = "";
        this.osoite = "";
        this.nimi = "";
        this.x = 0;
        this.y = 0;
        this.naapurit = new HashMap<String, String[]>();
    }

    /**
     * Palauttaa pysäkin koodin.
     * 
     * @return Pysäkin yksiselitteinen koodi. ID, jota voit käyttää pysäkin 
     *  tunnistamiseen.
     */
    public String getKoodi() {
        
        return this.koodi;
    }

    /**
     * Palauttaa pysäkin osoitteen.
     * 
     * @return Pysäkin katuosoite. Jotkin osoitteet sisältävät kadun ja numeron, 
     * toiset vain kadun nimen.
     */
    public String getOsoite() {
        return this.osoite;
    }

    /**
     * Palauttaa pysäkin nimen.
     * 
     * @return Pysäkin nimi. Tämä ei välttämättä ole yksiselitteinen.
     */
    public String getNimi() {
        return this.nimi;
    }

    /**
     * Palauttaa pysäkin sijainnin x-koordinaatin.
     * 
     * @return Pysäkin maantieteellisen sijainnin x-koordinaatti.
     */
    public int getXKoordinaatti() {
        return this.x;
    }

    /**
     * Palauttaa pysäkin sijainnin y-koordinaatin
     * 
     * @return Pysäkin maantieteellisen sijainnin y-koordinaatti.
     */
    public int getYKoordinaatti() {
        return this.y;
    }

    /**
     * Palauttaa naapuripysäkkien koodit.
     * 
     * @return naapuripysäkit tunnuskoodit
     */
    public String[] getNaapurit() {
        
        return (this.naapurit.keySet()).toArray(new String[0]);
    }
    
    /**
     * Palauttaa yhdelle naapuripysäkille kulkevien linjojen koodit.
     * @param naapuri jonkin naapuripysäkin tunnuskoodi
     * @return linjojen tunnukset
     */
    public String[] getNaapuriinKulkevatLinjat(String naapuri){
        return naapurit.get(naapuri);
    }
}

