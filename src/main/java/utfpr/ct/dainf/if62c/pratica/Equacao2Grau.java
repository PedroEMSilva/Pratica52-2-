package utfpr.ct.dainf.if62c.pratica;


import static java.lang.Math.sqrt;
import static oracle.jrockit.jfr.events.Bits.doubleValue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 * @param <TipoNumero>
 */
public class Equacao2Grau<TipoNumero extends Number> {
    private TipoNumero a,b,c;
    
    
    public Equacao2Grau(TipoNumero a,TipoNumero b,TipoNumero c){
     if (a.doubleValue()==0) {
            throw new RuntimeException(
                "Coeficiente a não pode ser zero");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /**
     * @return the a
     */
    public TipoNumero getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(TipoNumero a) {
        if (a.doubleValue()==0) {
            throw new RuntimeException(
                "Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    /**
     * @return the b
     */
    public TipoNumero getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(TipoNumero b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public TipoNumero getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(TipoNumero c) {
        this.c = c;
    }
     public double getRaiz1(){
         double delta= (b.doubleValue()*b.doubleValue()) -((double)4*a.doubleValue()*c.doubleValue());
         if(delta<0){
         throw new RuntimeException(
                "Equação não tem solução real");
         }
         return((-1)*b.doubleValue()+ sqrt(delta))/(double)2*a.doubleValue();
         
     }
     public double getRaiz2(){
         double delta= (b.doubleValue()*b.doubleValue()) -((double)4*a.doubleValue()*c.doubleValue());
                if(delta<0){
         throw new RuntimeException(
                "Equação não tem solução real");
         }
         return((-1)*b.doubleValue()- sqrt(delta))/(double)2*a.doubleValue();
         
     }
     
}
