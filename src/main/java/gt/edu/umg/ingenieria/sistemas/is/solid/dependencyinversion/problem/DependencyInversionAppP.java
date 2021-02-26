package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.problem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class DependencyInversionAppP {

    /**
     * Default constructor
     */
    public DependencyInversionAppP() {
    }

    /**
     * @param args 
     * @param
     */
    @RequestMapping("/diproblem")
    public static void main(String[] args) {
        CoffeeMakerP coffeMaker = new CoffeeMakerP();

        coffeMaker.makeCoffe();

    }

}