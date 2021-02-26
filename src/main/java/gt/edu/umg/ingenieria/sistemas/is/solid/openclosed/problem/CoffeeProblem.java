package gt.edu.umg.ingenieria.sistemas.is.solid.openclosed.problem;

import java.util.*;

/**
 * 
 */
public class CoffeeProblem {

    /**
     * Default constructor
     */
    public CoffeeProblem() {
    }

    /**
     * @param coffee 
     * @return
     */
    public String coffee(String coffee) {
        switch (coffee.toUpperCase()) {
            case "LATTE":
                return "Soy un cafe latte";
            case "CAPUCHINO":
                return "Soy un cafe capuchino";
            case "AMERICANO":
                return "Soy un cafe Americano";
            default:
                return "ERROR: no tenemos ese cafe!!!";
        }
    }

}