package DesignPattern.structuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory implements Component{
    private final String name;
    private final List<Component>children=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    public void add(Component component){
        children.add(component);
    }
    public void remove(Component component){
        children.remove(component);
    }
    public List<Component> children(){
        return Collections.unmodifiableList(children);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public long size() {
        long total=0;
        for(Component component: children){
            total+=component.size();
        }
        return total;

    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name + " [" + size() + "B]");
        for (Component c : children) c.print(indent + "  ");
    }
}
