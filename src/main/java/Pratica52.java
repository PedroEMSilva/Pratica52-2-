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
            e1 = new Equacao2Grau(1,0,1);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        try {
            System.out.println(e1.getRaiz1(e1) + "  e  " + e1.getRaiz2(e1));
        } catch (Exception t) {
            System.out.println(t.getLocalizedMessage());
        }
    }
}
