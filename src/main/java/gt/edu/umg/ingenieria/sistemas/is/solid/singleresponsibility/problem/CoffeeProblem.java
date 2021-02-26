package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.problem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */

@RestController
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

    @RequestMapping("/sr")
    public String addCoffee(String coffee) {
        switch (coffee.toUpperCase()) {
            case "LATTE":
                return "Soy un Latte";
            case "CAPUCHINO":
                return "Soy un Capuchino";
            default:
                return "ERROR: no tenemos ese cafe!!!";
        }
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

}