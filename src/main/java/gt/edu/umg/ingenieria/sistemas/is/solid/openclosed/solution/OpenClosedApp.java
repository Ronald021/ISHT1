package gt.edu.umg.ingenieria.sistemas.is.solid.openclosed.solution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */

@RestController
public class OpenClosedApp {

    /**
     * Default constructor
     */
    public OpenClosedApp() {
    }

    /**
     * @param args
     */

    @RequestMapping("/op")
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.println(coffeeMaker.coffee(new Americano()));
        System.out.println(coffeeMaker.coffee(new Latte()));
        System.out.println(coffeeMaker.coffee(new Capuchino()));
    }

}