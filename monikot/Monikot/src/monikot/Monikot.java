/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monikot;

/**
 *
 * @author Kalle
 */
public class Monikot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generaattori n = new Generaattori();
        System.out.println("Jos L=0, pätee A=0: "+  n.A + "%");
        System.out.println("---");
        System.out.println("Jos L=0, pätee B=0: "+  n.B + "%");
        System.out.println("---");
        System.out.println("Jos K=0, pätee A=1: "+  n.C + "%");
        System.out.println("---");
        System.out.println("Jos K=0 ja B=1, pätee A=0: "+  n.D + "%");
        System.out.println("---");
    }
}
