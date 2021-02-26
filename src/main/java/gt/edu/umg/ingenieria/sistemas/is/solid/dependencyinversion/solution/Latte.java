package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

/**
 * 
 */
public class Latte implements Coffee {

    /**
     * Default constructor
     */
    public Latte() {
    }

    /**
     * 
     */
    public void make() {
        System.out.println("Soy un cafe Latte, pero mejorado");
    }

}