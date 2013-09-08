/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package johtek_vk1;

/**
 *
 * @author Kalle
 */
public class JohTek_VK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pysakkiverkko pv = new Pysakkiverkko("D:\\Documents\\NetBeansProjects\\JohTek_VK1\\src\\johtek_vk1\\verkko.json");
        pv.lyhyinReitti("1291403", "1203410");
    }
}
