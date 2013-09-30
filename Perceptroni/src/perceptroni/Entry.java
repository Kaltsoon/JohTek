/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptroni;

/**
 *
 * @author Kalle
 */
public class Entry {
    public double distance;
    public int characterClass;
    public Entry(double distance, int characterClass){
        this.distance=distance;
        this.characterClass=characterClass;
    }
    public int compare(Entry a, Entry b){
        return (int)(this.distance-a.distance);
    }
}
