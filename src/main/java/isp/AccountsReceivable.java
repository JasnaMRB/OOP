package isp;

public class AccountsReceivable {
    private Accounting transactionObject;

    public AccountsReceivable(CustomerTransaction aTransaction) {
        this.transactionObject = aTransaction;
    }
    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
    }
}
