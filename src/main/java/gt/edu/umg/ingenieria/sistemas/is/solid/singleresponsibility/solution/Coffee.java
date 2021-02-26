package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.solution;

import java.util.*;

/**
 * 
 */
public class Coffee {

    /**
     * Default constructor
     */
    public Coffee() {
    }

    /**
     * @param coffee 
     * @return
     */
    public String Coffee(String coffee) {
        switch (coffee.toUpperCase()) {
            case "LATTE":
                return "Soy un Latte";
            case "CAPUCHINO":
                return "Soy un Capuchino";
            default:
                return "ERROR: no tenemos ese cafe!!!";
        }
    }

}