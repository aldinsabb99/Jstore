package Jstore;
/**
 * Kelas digunakan sebagai informasi item dengan suppliernya
 *
 * @author Aldinisa Rahma Sabillah
 * @version 27/02/2019
 */

public class Item
{
    //variabel yang dipakai
    private int id;
    public String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
        
    //constructor class item
    public Item(String name, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        //constructor
        id = DatabaseItem.getLastItemID()+1;
        this.name=name;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
        
    }
    
    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        // put your code here
        return id;
    }

    //Menampilkan nama Item
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        // put your code here
        return name;
    }

    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }

    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public ItemCategory getCategory()
    {
        // put your code here
        return category;
    }

    //Menampilkan kategori Item
    /**
     * Method getStatus()
     * @return status
     */
    public ItemStatus getStatus()
    {
        // put your code here
        return status;
    }
    
    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }

    //Mengganti nama Item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        // put your code here
        this.name=name;
    }

    //Mengganti stock Item
    /**
     * Method setStock()
     * @param stock
     */

    //Mengganti harga Item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        // put your code here
        this.price=price;
    }

    //Mengganti kategori Item
    /**
     * Method setCategory()
     * @param category
     */
    public void setCategory(ItemCategory category)
    {
        // put your code here
        this.category=category;
    }
    
    /**
     * Method setStatus()
     * @param status
     */
    public void setStatus(ItemStatus Status)
    {
        // put your code here
        this.status=status;
    }
    
    //Mengganti supplier Item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    //Mencetak nama Item
    /**
     * Method printData()
     */
    public String toString()
    {
       return "===============ITEM==============="
       + "\nID       : " + getId()
       + "\nName     : " + getName()
       + "\nCategory : " + getCategory()
       + "\nStatus   : " + getStatus()
       + "\nSupplier : " + supplier.getName() + "\n";
       
    }
}
