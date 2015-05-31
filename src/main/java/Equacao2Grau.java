
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
 */
public class Equacao2Grau<TipoNumero extends Number> {
    private TipoNumero a,b,c;
    
    
    public Equacao2Grau(TipoNumero a,TipoNumero b,TipoNumero c){
     if (doubleValue(a)==0) {
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
     public double getRaiz1(Equacao2Grau e){
         double delta= (doubleValue(e.b)*doubleValue(e.b)) -((double)4*doubleValue(e.a)*doubleValue(e.c));
         if(delta<0){
         throw new RuntimeException(
                "Equação não tem solução real");
         }
         return((-1)*doubleValue(e.b)+ sqrt(delta))/(double)2*doubleValue(e.a);
         
     }
     public double getRaiz2(Equacao2Grau e){
         double delta= (doubleValue(e.b)*doubleValue(e.b)) -((double)4*doubleValue(e.a)*doubleValue(e.c));
                if(delta<0){
         throw new RuntimeException(
                "Equação não tem solução real");
         }
         return((-1)*doubleValue(e.b)- sqrt(delta))/(double)2*doubleValue(e.a);
         
     }
     
}
