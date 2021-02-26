package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.problem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */

@RestController
public class SingleResponsibilityAppProblem {

    /**
     * Default constructor
     */
    public SingleResponsibilityAppProblem() {
    }

    /**
     * @param args
     */

    @RequestMapping("/srproblem")
    public static void main(String[] args) {
        CoffeeProblem coffeeProblem = new CoffeeProblem();
        System.out.println(coffeeProblem.addSmallCup(coffeeProblem.addCoffee("latte")));
        System.out.println(coffeeProblem.addMediumCup(coffeeProblem.addCoffee("capuchino")));
    }

}