
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(int id, Item item,String date, int totalItem, int totalPrice)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice);
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
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + getId());
        System.out.println("Date:" + getDate());
        System.out.println("Item:" + getItem().getName());
        System.out.println("Total Item:" + getTotalItem());
        System.out.println("Total Price:" + getTotalPrice());
        System.out.println("Status:" + getInvoiceStatus());
    }
}