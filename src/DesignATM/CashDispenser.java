package DesignATM;

public class CashDispenser {
    private int cashAvailable;
    public CashDispenser(int initialCash){
        this.cashAvailable=initialCash;
    }
    public synchronized void dispenseCase(int amount) throws IllegalAccessException {
        if(amount>cashAvailable){
            throw new IllegalAccessException("Insufficient cash available in the ATM");
        }
        cashAvailable-=amount;
        System.out.println("Cash dispensed "+ amount);
    }
}
