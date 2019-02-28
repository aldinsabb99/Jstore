
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
        
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

    public int getStock()
    {
        // put your code here
        return stock;
    }

    public int getPrice()
    {
        // put your code here
        return price;
    }

    public String getCategory()
    {
        // put your code here
        return category;
    }

    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }

    public void setName(String name)
    {
        // put your code here
        this.name=name;
    }

    public void setStock(int stock)
    {
        // put your code here
        this.stock=stock;
    }

    public void setPrice(int price)
    {
        // put your code here
        this.price=price;
    }

    public void setCategory(String category)
    {
        // put your code here
        this.category=category;
    }
    
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    public void printData()
    {
        
    }
}
