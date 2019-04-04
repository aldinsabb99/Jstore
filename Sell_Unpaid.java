import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id, Item item,int totalItem, Customer customer)
    {
         // initialise instance variables
         super(id,item,totalItem);
         this.customer=customer;
         this.dueDate = new GregorianCalendar();
         dueDate.add((GregorianCalendar.DATE), 1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
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
    
    public Customer getCustomer()
    {
        // put your code here
        return customer;
    }
    
    public Calendar getDueDate()
    {
        // put your code here
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        // put your code here
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        // put your code here
        this.dueDate=dueDate;
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
        System.out.println("Status:" + dueDate);
    }
}