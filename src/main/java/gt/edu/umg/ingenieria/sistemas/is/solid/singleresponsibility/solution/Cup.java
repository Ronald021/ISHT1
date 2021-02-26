package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.solution;

import java.util.*;

/**
 * 
 */
public class Cup {

    /**
     * Default constructor
     */
    public Cup() {
    }

    /**
     * @param coffee 
     * @return
     */
    public String addSmallCup(String coffee) {
        return coffee + " en un vaso pequeño";
    }

    /**
     * @param coffee 
     * @return
     */
    public String addMediumCup(String coffee) {
        return coffee + " en un vaso mediano";

    }

    /**
     * @param coffee 
     * @return
     */
    public String addLargeCup(String coffee) {
        return coffee + " en un vaso grande";

    }

}