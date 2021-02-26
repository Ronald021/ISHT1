package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution.solution;

import java.util.*;

/**
 * 
 */
public class Americano extends Coffee implements HotWater {

    /**
     * Default constructor
     */
    public Americano() {
    }

    /**
     * 
     */
    public void hotWater() {
        System.out.println("Agregando agua caliente al cafe americano");
    }

}