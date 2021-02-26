package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution.solution;

import java.util.*;

/**
 * 
 */
public class CoffeeMaker {

    /**
     * Default constructor
     */
    public CoffeeMaker() {
    }

    /**
     * @param coffee
     */
    public void addEvaporatedMilk(EvaporatedMilk coffee) {
        coffee.evaporatedMilk();
    }

    /**
     * @param coffee
     */
    public void addHotMilk(HotMilk coffee) {
        coffee.hotMilk();
    }

    /**
     * @param coffee
     */
    public void addHotWater(HotWater coffee) {
        coffee.hotWater();
    }

}