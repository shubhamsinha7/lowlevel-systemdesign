package DesignPattern.structuralDesignPattern.CompositeDesignPattern.fileSystem;

public class Main {
    public static void main(String[] args) {
        Directory root=new Directory("root");
        Directory src=new Directory("src");
        Directory img=new Directory("image");

        root.add(new FileLeaf("README.md", 1200));
        root.add(src);
        src.add(new FileLeaf("App.java", 3400));
        src.add(new FileLeaf("Utils.java", 2100));
        root.add(img);
        img.add(new FileLeaf("logo.png", 48_000));

        root.print("");
        System.out.println("Total size: " + root.size() + " bytes");
    }
}
