package isp;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName() {
       return "yay";
        // return customer.getName();
    }
    @Override
    public Date getDate() {
        return new Date();
    }
    @Override
    public String productBreakDown() {
        /*String reportListing = "";
        for (Product product: products) {
             reportListing += product.getProductName();
         }
        return reportListing;*/
        return "yay";
    }
    @Override
    public void prepareInvoice() {
        System.out.println("Invoice prepared...");
    }
    @Override
    public void chargeCustomer() {
        System.out.println("Charged the customer...");
    }

}
