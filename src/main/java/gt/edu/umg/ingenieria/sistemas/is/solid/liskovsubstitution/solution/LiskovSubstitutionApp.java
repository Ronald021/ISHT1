package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class LiskovSubstitutionApp {

    /**
     * Default constructor
     */
    public LiskovSubstitutionApp() {
    }

    /**
     * @param args
     */

    @RequestMapping("/lis")
    public static void main(String[] args) {
        Cook cook = new Cook();

        cook.sweetenCoffee(new Coffee());
        cook.sweetenPancakes(new Pancake());
    }

}