/**
 Aldinisa Rahma Sabillah 1606830215
**/

public class JStore
{
    // instance variables - replace the example below with your own
 
    /**
     * Constructor for objects of class JStore
     */
   
    public static void main(String[] args)
    {
        // initialise instance variables
        Location location1 = new Location("Cirebon", "Jawa Barat", "SMA N 1 Cirebon");
        Supplier supplier1 = new Supplier(1234, "Aldin", "aldinsabillah9@gmail.com","085324617200", location1);
        
        location1.printData();
        supplier1.printData();
        
        Transaction transaction1 = new Transaction();
        transaction1.orderNewItem(supplier1);
        transaction1.sellItemInstallment(DatabaseItem.getItem());
    }
    
    public JStore()
    {
        // put your code here
        
    }
}
