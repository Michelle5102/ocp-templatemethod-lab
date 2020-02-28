package lab.assignment.afterrefactoring;

public class Americano extends CoffeeMaker {

    @Override
    protected void finalTouch(){
        System.out.println("Adding sugar");
    }

    @Override
    protected void addIngredients(){
        System.out.println("Adding hot water");
    }
}