package DesignPattern.structuralDesignPattern.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Document document1=new DocumentProxy("confidential.pdf","ADMIN");
        Document document2=new DocumentProxy("confidential.pdf","GUEST");

        System.out.println("===ADMIN=====");
        document1.read();
        document1.write();

        System.out.println("\n ===GUEST Access====");
        document2.read();
        document2.write();

    }
}
