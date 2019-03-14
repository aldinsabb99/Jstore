
/**
 * Kelas digunakan sebagai informasi lokasi
 *
 * @author Aldinisa Rahma Sabillah
 * @version 27/3/2019
 */
public class Location
{
    //variabel yang dipakai
    private String province;
    private String description;
    private String city;

    //Konstruktor dari kelas Supplier
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city=city;
        this.province=province;
        this.description=description;
    }
    
    //Menampilkan nama provinsi
    /**
     * Method getProvince()
     * @return province
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    //Menampilkan nama kota
    /**
     * Method getCity()
     * @return city
     */
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    //Menampilkan deskripsi lokasi
    /**
     * Method getDescription()
     * @return description
     */
    public String getDescription()
    {
        // put your code here
        return description;
    }
    
    //Mengganti nama provinsi
    /**
     * Method setProvince()
     * @param province
     */
    public void setProvince(String Province)
    {
        // put your code here
        this.province=province;
    }
    
    //Mengganti nama kota
    /**
     * Method setCity()
     * @param city
     */
    public void setCity(String city)
    {
        // put your code here
        this.city=city;
    }
    
    //Mengganti deskripsi lokasi
    /**
     * Method setDescription()
     * @param description
     */
    public void setDescription(String description)
    {
        // put your code here
        this.description=description;
    }
    
    //Mencetak nama provinsi
    /**
     * Method printData()
     */
    public void printData()
    {
        System.out.println(province);
    }
}
