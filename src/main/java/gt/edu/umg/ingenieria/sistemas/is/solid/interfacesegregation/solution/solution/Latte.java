package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution.solution;

import java.util.*;

/**
 * 
 */
public class Latte extends Coffee implements EvaporatedMilk, HotMilk {

    /**
     * Default constructor
     */
    public Latte() {
    }

    /**
     * 
     */
    public void evaporatedMilk() {
        System.out.println("Agregando leche evaporada al latte");
    }

    /**
     * 
     */
    public void hotMilk() {
        System.out.println("Agregando leche caliente al latte");
    }

}