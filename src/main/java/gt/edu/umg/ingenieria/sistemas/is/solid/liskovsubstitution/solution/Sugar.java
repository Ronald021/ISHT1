package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import java.util.*;

/**
 * 
 */
public class Sugar extends Sweetener {

    /**
     * Default constructor
     */
    public Sugar() {
    }

    @Override
    public void sweeten() {
        System.out.println("Estoy endulzando con azucar");
    }

}