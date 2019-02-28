
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    public Invoice(int id, Item item, String date, int totalPrice)
    {
        // initialise instance variables
        this.id=id;
        this.date=date;
        this.totalPrice=totalPrice;
    }

    public int getId()
    {
        // put your code here
        return id;
    }
    
    public Item getItem()
    {
        // put your code here
        return item;
    }
    
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }
    
    public void setItem(Item item)
    {
        // put your code here
        this.item=item;
    }
    
    public void setDate(String date)
    {
        // put your code here
        this.date=date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice=totalPrice;
    }
    
    public void printData()
    {
        
    }
}
