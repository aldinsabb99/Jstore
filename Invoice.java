
/**
 * Kelas digunakan sebagai informasi Invoice barang dengan itemnya
 *
 * @author Aldinisa Rahma Sabillah
 * @version 27/02/2019
 */
public class Invoice
{
    //variabel yang digunakan
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    //Konstruktor dari kelas Invoice
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        // initialise instance variables
        this.id=id;
        this.date=date;
        this.totalPrice=totalPrice;
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
    
    public void printData()
    {
        System.out.println(totalPrice);
    }
}
