/**
 * @author Aldinisa Rahma Sabillah
 * @version 21 Maret 2019
**/
    // instance variables - replace the example below with your own

    public class JStore
{
    
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        //put code in here
    }

    
    public static void main(String args[])
    {
        // put your code here
        Location location = new Location("Cirebon", "Jawa Barat", "Khusus");
        Supplier supplier = new Supplier(1, "Aldin", "aldinsabillah9@gmail.com", "085324617200", location);
        Item item = new Item(1, "Aldinisa Rahma Sabillah", 100, 100000, ItemCategory.Electronics, ItemStatus.New, supplier);
        Transaction transaction = new Transaction();
        DatabaseItem.addItem(item);
        transaction.orderNewItem(item);
        transaction.sellItemPaid(item);
        transaction.sellItemUnpaid(item);
        transaction.sellItemInstallment(item);
        
    }
}