package gt.edu.umg.ingenieria.sistemas.is.solid.openclosed.problem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */

@RestController
public class OpenClosedAppProblem {

    /**
     * Default constructor
     */


    public OpenClosedAppProblem() {
    }

    /**
     * @param args
     */

    @RequestMapping("/opproblem")
    public static void main(String[] args) {
       CoffeeProblem coffeeProblem = new CoffeeProblem();

        System.out.println(coffeeProblem.coffee("latte"));
        System.out.println(coffeeProblem.coffee("capuchino"));
        System.out.println(coffeeProblem.coffee("Americano"));
    }

}