package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */
@RestController
public class DependencyInversionApp {

    /**
     * Default constructor
     */
    public DependencyInversionApp() {
    }

    /**
     * @param args
     */
    @RequestMapping("/di")
    public static void main(String[] args) {
       List<Coffee> coffe = new ArrayList<>();

       Latte latte = new Latte();
       Americano americano = new Americano();

       coffe.add(latte);
       coffe.add(americano);

       CoffeMaker coffeMaker = new CoffeMaker(coffe);

       coffeMaker.makeCoffee();
    }

}