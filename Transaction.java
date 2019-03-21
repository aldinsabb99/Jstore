   
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    
    public void orderNewItem(Item item)
    {
        // put your code here
        System.out.println("===================Order New Item===================");
        Invoice buypaid1 = new Buy_Paid(1234, item, "21 Maret 2019", 99, item.getPrice());
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        
        }
        else {
            System.out.println("Sala Invoice Type bukan Sell_Paid");
        
        }
        item.printData();
        buypaid1.printData();
    }
    
    public void orderSecondItem(Item item)
    {
        // put your code here
        System.out.println("===================Order Second Item===================");
        Invoice buypaid1 = new Buy_Paid(1234, item, "21 Maret 2019", 99, item.getPrice());
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        
        }
        else {
            System.out.println("Sala Invoice Type bukan Sell_Paid");
        
        }
        item.printData();
        buypaid1.printData();
    }
    
    public void orderRefurbishedItem(Item item)
    {
        // put your code here
        System.out.println("===================Order Refurbished Item===================");
        Invoice buypaid1 = new Buy_Paid(1234, item, "21 Maret 2019", 99, item.getPrice());
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        
        }
        else {
            System.out.println("Sala Invoice Type bukan Sell_Paid");
        
        }
        item.printData();
        buypaid1.printData();
    }
    
    public void sellItemPaid(Item item)
    {
        // put your code here
        Invoice buypaid1 = new Sell_Paid(1234, item, "21 Maret 2019", 99, item.getPrice());
        item.printData();
        buypaid1.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        // put your code here
        Invoice buypaid1 = new Sell_Unpaid(1234, item, "21 Maret 2019", 99, item.getPrice(), "30 Maret 2019");
        item.printData();
        buypaid1.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        // put your code here
        Invoice buypaid1 = new Sell_Installment(1234, item, "21 Maret 2019", 99, item.getPrice(), 6);
        item.printData();
        buypaid1.printData();
    }
    
    
}
