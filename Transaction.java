
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    
    public void orderNewItem(Supplier supplier)
    {
        // put your code here
        System.out.println("===================Order New Item===================");
        Item item1 = new Item(546, "Laptop", 10, 100000, ItemCategory.Electronics, ItemStatus.New, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(789, item1, "14 Maret 2018", item1.getPrice());
        invoice1.setTotalItem(1);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        // put your code here
        System.out.println("===================Order Second Item===================");
        Item item1 = new Item(546, "Laptop", 10, 100000, ItemCategory.Electronics, ItemStatus.Second, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(789, item1, "14 Maret 2018", item1.getPrice());
        invoice1.setTotalItem(1);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        // put your code here
        System.out.println("===================Order Refurbished Item===================");
        Item item1 = new Item(546, "Laptop", 10, 100000, ItemCategory.Electronics, ItemStatus.Refurbished, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(789, item1, "14 Maret 2018", item1.getPrice());
        invoice1.setTotalItem(1);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void sellItemPaid(Item item)
    {
        // put your code here
        Invoice invoice1 = new Invoice(789, item, "14 Maret 2018", item.getPrice()); 
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        invoice1.setTotalItem(1);
        invoice1.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        // put your code here
        Invoice invoice1 = new Invoice(789, item, "14 Maret 2018", item.getPrice()); 
        invoice1.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        invoice1.setTotalItem(1);
        invoice1.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        // put your code here
        Invoice invoice1 = new Invoice(789, item, "14 Maret 2018", item.getPrice()); 
        invoice1.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        invoice1.setTotalItem(1);
        invoice1.printData();
    }
    
    
}
