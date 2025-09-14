package DesignPattern.structuralDesignPattern.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new Farmhouse();
        System.out.println("Normal Farmhouse pizza cost: "+ basePizza.cost());
        BasePizza basePizza1=new ExtraCheese(new Farmhouse());
        System.out.println("Farmhouse pizza + extra cheese cost: "+ basePizza1.cost());
    }
}
