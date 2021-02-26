package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import java.util.*;

/**
 * 
 */
public class Honey extends Sweetener {

    /**
     * Default constructor
     */
    public Honey() {
    }

    @Override
    public void sweeten() {
        System.out.println("Estoy endulzando con miel");
    }
}