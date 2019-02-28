
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city=city;
        this.province=province;
        this.description=description;
    }

    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    public String getDescription()
    {
        // put your code here
        return description;
    }
    
    public void setProvince(String Province)
    {
        // put your code here
        this.province=province;
    }
    
    public void setCity(String city)
    {
        // put your code here
        this.city=city;
    }
    
    public void setDescription(String description)
    {
        // put your code here
        this.description=description;
    }
    
    public void printData()
    {
        
    }
}
