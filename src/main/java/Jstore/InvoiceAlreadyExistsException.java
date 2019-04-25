package Jstore;
public class InvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;


    public InvoiceAlreadyExistsException(Invoice invoice_input){
        super("====Invoice Already Exists====\nInvoice with Item list : ");
        this.invoice_error=invoice_input;
        //getMessage();
    }

    public String getMessage(){
        return super.getMessage() + invoice_error.getItem() + " already ordered by "  + invoice_error.getCustomer().getUsername();
    }
}
