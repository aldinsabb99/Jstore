
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(id,item,totalItem);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod()
    {
        // put your code here
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        // put your code here
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        // put your code here
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice()
    {
        this.installmentPrice = (totalPrice/installmentPeriod)*102/100;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice= installmentPrice*installmentPrice;
    }
    
    public void setCustomer(Customer customer)
    {
        // put your code here
        this.customer=customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus Status)
    {
        
    }
    
    public String toString()
    {
        // put your code here
        return "";
    }
    
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + getId());
        System.out.println("Date:" + getDate());
        System.out.println("Item:" + getItem().getName());
        System.out.println("Total Item:" + getTotalItem());
        System.out.println("Total Price:" + getTotalPrice());
        System.out.println("Status:" + getInvoiceStatus());
        System.out.println("Status:" + installmentPrice);
    }
}