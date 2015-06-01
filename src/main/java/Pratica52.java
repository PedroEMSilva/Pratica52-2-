
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau e1 = null;
        try {
            e1 = new Equacao2Grau(1,3,2);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        try {
            System.out.println(e1.getRaiz2() + "  e  " + e1.getRaiz1());
        } catch (Exception t) {
            System.out.println(t.getLocalizedMessage());
        }
          Equacao2Grau e3 = null;
        try {
            e3 = new Equacao2Grau(1,2,3);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        try {
            System.out.println(e3.getRaiz2() + "  e  " + e3.getRaiz1());
        } catch (Exception t) {
            System.out.println(t.getLocalizedMessage());
        }
        
        
         Equacao2Grau e2 = null;
        try {
            e2 = new Equacao2Grau(1,4,4);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        try {
            System.out.println(e2.getRaiz2() + "  e  " + e2.getRaiz1());
        } catch (Exception t) {
            System.out.println(t.getLocalizedMessage());
        }
       
        
        
    }
    
    
}
