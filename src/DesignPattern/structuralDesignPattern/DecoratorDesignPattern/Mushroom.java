package DesignPattern.structuralDesignPattern.DecoratorDesignPattern;

public class Mushroom extends Topping{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+100;
    }
}
