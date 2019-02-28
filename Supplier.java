
/**
 * Write a description of class Supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supplier
{
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

    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    public String getphoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }
    
    public void setEmail(String email)
    {
        // put your code here
        this.email=email;
    }
    
    public void setPhoneNumber(String PhoneNumber)
    {
        // put your code here
        this.phoneNumber=phoneNumber;
    }
    
    public void setCity(String city)
    {
        // put your code here
        this.city=city;
    }
    
    public void printData()
    {
        
    }
}
