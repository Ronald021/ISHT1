package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import java.util.*;

/**
 * 
 */
public class Coffee extends Sugar {

    /**
     * Default constructor
     */
    public Coffee() {
    }

    @Override
    public void sweeten() {
        System.out.println("Soy un cafe y me endulzaron con azucar");
    }
}