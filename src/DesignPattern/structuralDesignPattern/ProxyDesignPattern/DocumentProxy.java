package DesignPattern.structuralDesignPattern.ProxyDesignPattern;

public class DocumentProxy implements Document{
    private RealDocument realDocument;
    private String role;
    DocumentProxy(String fileName, String role){
        this.realDocument=new RealDocument(fileName);
        this.role=role;
    }
    @Override
    public void read() {
        //Every one can read
        realDocument.read();
    }

    @Override
    public void write() {
        if("ADMIN".equalsIgnoreCase(role)){
            realDocument.write();
        }
        else {
            System.out.println("Access Denied only Admin can write to the document");
        }
    }
}
