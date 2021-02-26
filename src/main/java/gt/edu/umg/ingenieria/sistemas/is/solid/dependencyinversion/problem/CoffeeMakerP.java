package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.problem;

/**
 * 
 */
public class CoffeeMakerP {

    /**
     * Default constructor
     */
    public CoffeeMakerP() {
    }

    /**
     * 
     */
    private LatteP latte = new LatteP();

    /**
     * 
     */
    private AmericanoP americano = new AmericanoP();

    /**
     * 
     */
    public void makeCoffe() {
        latte.newLatte();
        americano.newAmericano();
    }

}