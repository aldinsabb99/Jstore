package Jstore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
/**
 * @author Aldinisa Rahma Sabillah
 * @version 21 Maret 2019
**/
    // instance variables - replace the example below with your own

 public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
    {
        SpringApplication.run(JStore.class, args);
        Location lokasi = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        Supplier sup1 = new Supplier("Dhio", "dhio@ui.ac.id", "08234", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup1);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup2 = new Supplier("Bayu", "bayu@ui.ac.id", "08256", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup2);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup3 = new Supplier("Fadel", "fadel@ui.ac.id", "08278", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup3);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }

        //for (Supplier supplier : DatabaseSupplier.getSupplierDatabase())
        //{
          //  System.out.println(supplier);
        //}
        /**try{
            DatabaseCustomer.addCustomer(new Customer("Aldinisa", "aldinisa@ui.ac.id", "aldinisa", "Aldin145", 1999, 7, 3));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("Rahma", "rahma@ui.ac.id", "rahma", "Rahma145", 1999, 7, 3));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("Sabillah", "sabillah@ui.ac.id", "sabillah", "Sabillah145", 1999, 7, 3));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }**/


        //for (Customer customer : DatabaseCustomer.getCustomerDatabase())
        //{
          //  System.out.println(customer);
        //}
        
        try{
            DatabaseItem.addItem(new Item("Buku", ItemStatus.New, 290000, DatabaseSupplier.getSupplier(1),ItemCategory.Stationery));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Laptop", ItemStatus.New, 5900000, DatabaseSupplier.getSupplier(2),ItemCategory.Electronics));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Sofa", ItemStatus.New, 600000, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Meja", ItemStatus.New, 200000, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }


        //for (Item item : DatabaseItem.getItemDatabase())
        //{
          //      System.out.println(item);
        //}
        /**
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(3);
        ArrayList<Integer> items2 = new ArrayList<>();
        items.add(3);
        items.add(2);
        try{
            DatabaseInvoice.addInvoice(new Sell_Paid(items, DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseInvoice.addInvoice(new Sell_Unpaid(items1, DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException e){
            System.out.println(e);
        }
        //for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        //{
            //System.out.println(invoice);
        //}
        Supplier sup4 = new Supplier("Dhio", "dhio@ui.ac.id", "08234", lokasi);
        try {
            DatabaseSupplier.addSupplier(sup4);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try{
            DatabaseCustomer.addCustomer(new Customer("Aldinisa", "aldinisa@ui.ac.id", "aldinisa", "Aldin145", 1999, 7, 3));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        try{
            DatabaseItem.addItem(new Item("Sofa", ItemStatus.New, 600000, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e.getMessage());
        }**/
        /**try{
            DatabaseInvoice.addInvoice(new Sell_Unpaid(items1, DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException e){

            System.out.println(e.getMessage());
        }**/
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        

    }
}
