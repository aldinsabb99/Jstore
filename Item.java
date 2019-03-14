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
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
        
    //constructor class item
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        //constructor
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
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

    //Menampilkan stock Item
    /**
     * Method getStock()
     * @return stock
     */
    public int getStock()
    {
        // put your code here
        return stock;
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
    public String getCategory()
    {
        // put your code here
        return category;
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
    public void setStock(int stock)
    {
        // put your code here
        this.stock=stock;
    }

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
    public void setCategory(String category)
    {
        // put your code here
        this.category=category;
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
    public void printData()
    {
       System.out.println(name); 
    }
}
