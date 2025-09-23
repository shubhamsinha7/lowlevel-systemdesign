package DesignATM;

public class WithdrawalTransaction extends Transaction{
    protected WithdrawalTransaction(String transactionId, Account account, double amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
