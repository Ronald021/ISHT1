package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

import java.util.*;

/**
 * 
 */
public class CoffeMaker {

    /**
     * 
     */
    private List<Coffee> coffee;

    /**
     * @param coffee
     */
    public CoffeMaker(List<Coffee> coffee) {
        this.coffee = coffee;
    }

    /**
     * 
     */
    public void makeCoffee() {
        for (Coffee animal : this.coffee) {
            animal.make();
        }
    }

}