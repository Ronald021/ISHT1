package gt.edu.umg.ingenieria.sistemas.is.solid.singleresponsibility.solution;

import java.util.*;

/**
 * 
 */
public class SingleResponsibilityApp {

    /**
     * Default constructor
     */
    public SingleResponsibilityApp() {
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
       Coffee coffee = new Coffee();
       Cup cup = new Cup();

        System.out.println(cup.addSmallCup(coffee.Coffee("latte")));
        System.out.println(cup.addLargeCup(coffee.Coffee("capuchino")));

        System.out.println(cup.addMediumCup(coffee.Coffee("latte")));
        System.out.println(cup.addSmallCup(coffee.Coffee("capuchino")));

    }

}