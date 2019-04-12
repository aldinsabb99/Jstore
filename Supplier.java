
/**
 * Kelas digunakan sebagai informasi supplier dengan lokasinya
 *
 * @author Aldinisa Rahma Sabillah
 * @version 27/2/2019
 */
public class Supplier
{
    //variabel yang dipakai
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String city;
    private Location location;
    
    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;  
    }

    //Menampilkan nomor id supplier
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    //Menampilkan email supplier
    /**
     * Method getEmail()
     * @return email
     */
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    //Menampilkan nomor telepon supplier
    /**
     * Method getPhoneNumber()
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        return location;
    }
    
    //Mengubah id supplier
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    //Mengubah nama supplier
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    //Mengubah email supplier
    /**
     * Method setEmail()
     * @param email
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    //Mengubah nomor telepon supplier
    /**
     * Method setPhoneNumber()
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    //Mengubah lokasi supplier
    /**
     * Method setLocation()
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    
    //Mencetak nama supplier
    /**
     * Method printData()
     */
    public void printData()
    {
         System.out.println("===============SUPPLIER===============");
         System.out.println("ID             : " + id);
         System.out.println("Name           : " + name);
         System.out.println("Email          : " + email);
         System.out.println("Phone Number   : " + phoneNumber);
         System.out.println("Location       : " + location.getCity());
    }
}
