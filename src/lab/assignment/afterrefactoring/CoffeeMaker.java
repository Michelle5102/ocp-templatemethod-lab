package lab.assignment.afterrefactoring;


public abstract class CoffeeMaker {

    //template method, final so subclasses can't override

    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }
}