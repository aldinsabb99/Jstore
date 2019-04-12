import java.util.*;
/**
 * Kelas digunakan sebagai informasi database dari supplier
 *
 * @author Aldinisa Rahma Sabillah
 * @version 3/3/2019
 */

import java.util.*;

public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public static boolean addSupplier(Supplier supplier)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if((temp.getName() == supplier.getName()) && 
            (temp.getEmail() == supplier.getEmail()) && 
            (temp.getPhoneNumber() == supplier.getPhoneNumber())) 
            {
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static Supplier getSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Method untuk menghapus supplier dari list
     *
     */
    public static boolean removeSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id)
            {
                DatabaseItem.getItemFromSupplier(temp).clear();
                return true;
            }
        }
        return false;
    }
}
