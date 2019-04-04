
/**
 * Class ini adalah informasi database dari item.
 *
 * @author Aldinisa Rahma Sabillah
 * @version 05/03/2019
 */
public class DatabaseItem
{
    // variabel yang digunakan
    private Item[] listItem;
    public static Item itemDB;

    //Menambah item
    /**
     * Method addItem()
     * @param item
     * @return false
     */
    public static boolean addItem(Item item)
    {
        // initialise instance variables
        itemDB=item;
        return false;
    }

    //Menghapus item
    /**
     * Method removeItem()
     * @param item
     * @return false
     */
    public boolean removeItem(Item item)
    {
        // put your code here
        return false;
    }
    
    //Menampilkan item
    /**
     * Method getItem()
     * @return item
     */
    public static Item getItem()
    {
        // put your code here
        
        return itemDB;
    }
    
    //Menampilkan list item
    /**
     * Method getItemDatabase()
     * @return listItem
     */
    public Item[] getItemDatabase()
    {
        // put your code here
        return listItem;
    }
   
}
