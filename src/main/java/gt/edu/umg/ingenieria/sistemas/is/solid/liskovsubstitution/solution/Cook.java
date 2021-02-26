package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

import java.util.*;

/**
 * 
 */
public class Cook {

    /**
     * Default constructor
     */
    public Cook() {
    }

    /**
     * @param sweetener
     */
    public void sweetenCoffee(Sweetener sweetener) {
        sweetener.sweeten();
    }

    /**
     * @param sweetener
     */
    public void sweetenPancakes(Sweetener sweetener) {
        sweetener.sweeten();
    }

}