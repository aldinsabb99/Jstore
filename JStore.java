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
        Item sepatu = new Item(546, "Sepatu blink", 10, 100000, "Fashion", supplier1);
        Invoice invoice1= new Invoice(789, sepatu, "6 Maret 2019", 100000);
        supplier1.printData();
        supplier1.setName("Fariz");
        supplier1.printData();
        sepatu.printData();
        DatabaseItem.addItem(sepatu);
        System.out.println(9+"years");
    }
    
    public JStore()
    {
        // put your code here
        
    }
}
