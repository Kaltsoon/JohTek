package monikot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Generaattori {
    public double A=0;
    public double B=0;
    public double C=0;
    public double D=0;
    public Generaattori(){
        generoi();
    }
    private void generoi(){
        int lOnNolla=0;
        int lOnNollaJaAOnNolla=0;
        int lOnNollaJaBOnNolla=0;
        int kOnNolla=0;
        int kOnNollaJaAOnYks=0;
        int kOnNollaJaBOnYksJaAOnYks=0;
        int kOnNollaJaBOnYks=0;
        int RBeiK=0;
        int jA=0;
        int RSB=0;
        int K=0;
        int K2=0;
        int eiRSB=0;
        for(int i=0; i<1000000; i++){
            int rand=(int)Math.round(Math.random()*100+1);
            int a=0;
            if(rand<=90){
                a=1;
            }
            rand=(int)Math.round(Math.random()*100+1);
            int r=0;
            if(rand<=90 && a==1){
                r=1;
            }
            rand=(int)Math.round(Math.random()*100+1);
            int s=0;
            if(rand<=95 && a==1){
                s=1;
            }
            rand=(int)Math.round(Math.random()*100+1);
            int b=0;
            if(rand<=95){
                b=1;
            }
            rand=(int)Math.round(Math.random()*100+1);
            int k=0;
            if(rand<=95 && b==1 && s==1){
                k=1;
            }
            rand=(int)Math.round(Math.random()*100+1);
            int l=0;
            if(rand<=99 && k==1){
                l=1;
            }
            if(l==0){
                lOnNolla++;
                if(a==0){
                    lOnNollaJaAOnNolla++;
                }
                if(b==0){
                    lOnNollaJaBOnNolla++;
                }
            }
            if(k==0){
                kOnNolla++;
                if(a==1){
                    kOnNollaJaAOnYks++;
                }
            }
            if(k==0 && b==0){
                kOnNollaJaBOnYks++;
                if(a==1){
                    kOnNollaJaBOnYksJaAOnYks++;
                }
            }
            if(r==1 && b==1 && k==0){
                RBeiK++;
                if(a==1){
                    jA++;
                }
            }
            if(r==1 && s==1 && b==1){
                RSB++;
                if(k==1){
                    K++;
                }
            }
            if(r==0 && s==1 && b==1){
                eiRSB++;
                if(k==1){
                    K2++;
                }
            }
        }
        System.out.println("A) " + (jA/(double)RBeiK));
        System.out.println("B) " + (K/(double)RSB));
        System.out.println("C) " + (K2/(double)eiRSB));
        A=lOnNollaJaAOnNolla/(double)lOnNolla;
        A*=100;
        B=lOnNollaJaBOnNolla/(double)lOnNolla;
        B*=100;
        C=kOnNollaJaAOnYks/(double)kOnNolla;
        C*=100;
        D=kOnNollaJaBOnYksJaAOnYks/(double)kOnNollaJaBOnYks;
        D*=100;
    }
}
