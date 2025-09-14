package DesignPattern.structuralDesignPattern.ProxyDesignPattern;

public class RealDocument implements Document{
    private String fileName;
    RealDocument(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void read() {
        System.out.println("Reading Document "+fileName);
    }

    @Override
    public void write() {
        System.out.println("Writing to documents "+fileName);
    }
}
