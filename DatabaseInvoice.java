import java.util.*;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Aldinisa Rahma Sabillah
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE;
    private static int LAST_INVOICE_ID;
    
    public ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID ()
    {
        // put your code here
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        return false;
    }
    
    /**
     * Method untuk mengembalikan Invoice
     *
     * @return 
     */
    public static Invoice getInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
            
            
        }
        return null;
    }
    
    public Invoice getActiveOrder(Customer customer)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if((temp.getInvoiceStatus() == InvoiceStatus.Unpaid || temp.getInvoiceStatus() == InvoiceStatus.Installment)  && temp.getIsActive() == true)
            {
                return temp;
            }
            
            
        }
        return null;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    
    
    public static boolean removeInvoice(int id)
    {
        // put your code here
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActive() == true)
                {
                    temp.setIsActive(false);
                    INVOICE_DATABASE.remove(temp);
                    return true;
                }
                
            }
            
        }
        return false;
    }
    
    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        // initialise instance variables
    }

    
    
}