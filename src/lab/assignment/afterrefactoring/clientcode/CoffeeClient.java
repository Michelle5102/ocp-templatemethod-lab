package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.Capuccino;
import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.Americano;
import lab.assignment.afterrefactoring.Mocha;

public class CoffeeClient {

    public static void main(String[] args) {

        CoffeeMaker coffeeType = new Mocha();

        coffeeType.prepareCoffee();
        System.out.println("********************");

        coffeeType = new Capuccino();

        coffeeType.prepareCoffee();
        System.out.println("********************");

        coffeeType = new Americano();

        coffeeType.prepareCoffee();
        System.out.println("********************");
    }
}
