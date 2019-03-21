
/**
 * Kelas digunakan sebagai informasi Invoice barang dengan itemnya
 *
 * @author Aldinisa Rahma Sabillah
 * @version 27/02/2019
 */
public abstract class Invoice
{
    //variabel yang digunakan
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;

    //Konstruktor dari kelas Invoice
    public Invoice(int id, Item item, String date, int totalItem, int totalPrice)
    {
        // initialise instance variables
        this.id=id;
        this.date=date;
        this.totalItem=totalItem;
        this.totalPrice=totalPrice;
        this.item=item;
        
    }

    //Menampilkan nomor id invoice
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
     * Method getItem()
     * @return item
     */
    public Item getItem()
    {
        // put your code here
        return item;
    }
    
    //Menampilkan tanggal
    /**
     * Method getDate()
     * @return date
     */
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    //Menampilkan total harga
    /**
     * Method getTotalPrice()
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    public int getTotalItem()
    {
        // put your code here
        return totalItem;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return status;
    }
    
    public InvoiceType getInvoiceType()
    {
        return type;
    }
    //Mengubah id Item
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }
    
    //Mengubah nama Item
    /**
     * Method setItem()
     * @param item
     */
    public void setItem(Item item)
    {
        // put your code here
        this.item=item;
    }
    
    //Mengubah tanggal
    /**
     * Method setDate()
     * @param date
     */
    public void setDate(String date)
    {
        // put your code here
        this.date=date;
    }
    
    //Mengubah total harga
    /**
     * Method setTotalPrice()
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice=totalPrice;
    }
    
    public void setTotalItem(int totalItem)
    {
        // put your code here
        this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        // put your code here
        this.status=status;
    }
    
    public abstract void printData();
}
