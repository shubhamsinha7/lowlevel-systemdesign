package DesignPattern.structuralDesignPattern.FacadeDesignPattern;

public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade(){
        payment=new Payment();
        productDAO=new ProductDAO();
        invoice=new Invoice();
        sendNotification=new SendNotification();
    }
    public void createOrder(){
        Product product= productDAO.getProduct("123");
    }
}
