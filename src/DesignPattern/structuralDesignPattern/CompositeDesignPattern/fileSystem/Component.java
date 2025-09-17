package DesignPattern.structuralDesignPattern.CompositeDesignPattern.fileSystem;

public interface Component {
    String name();
    long size();
    void print(String indent);
}
