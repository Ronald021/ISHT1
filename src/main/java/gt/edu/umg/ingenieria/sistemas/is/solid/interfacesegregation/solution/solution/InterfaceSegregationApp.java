package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution.solution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.kerberos.KerberosKey;
import java.util.*;

/**
 * 
 */
@RestController
public class InterfaceSegregationApp {

    /**
     * Default constructor
     */
    public InterfaceSegregationApp() {
    }

    /**
     * @param args
     */
    @RequestMapping("/is")
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addEvaporatedMilk(new Latte());
        coffeeMaker.addHotMilk(new Latte());
        coffeeMaker.addHotWater(new Americano());

    }

}