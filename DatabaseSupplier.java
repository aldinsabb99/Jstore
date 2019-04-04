/**
 * Kelas digunakan sebagai informasi database dari supplier
 *
 * @author Aldinisa Rahma Sabillah
 * @version 3/3/2019
 */

public class DatabaseSupplier
{
    //variabel yang dipakai
    private Supplier[] listSupplier;
    private Supplier supplier;

    //Menambah supplier
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public boolean addSupplier(Supplier supplier)
    {
        // initialise instance variables
        return false;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public void removeSupplier(Supplier supplier)
    {
        // initialise instance variables
        this.supplier=supplier;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public Supplier[] geListSupplier()
    {
        return listSupplier;
    }
    
}
