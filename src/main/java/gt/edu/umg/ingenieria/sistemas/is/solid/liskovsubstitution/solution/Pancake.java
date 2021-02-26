package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import java.util.*;

/**
 * 
 */
public class Pancake extends Honey {

    /**
     * Default constructor
     */
    public Pancake() {
    }

    @Override
    public void sweeten() {
        System.out.println("Soy un pancake y me endulzaron con miel");
    }
}