
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author Aldinisa Rahma Sabillah
 * @version 21 maret 2019
 */
public enum InvoiceType
{
    Buy("Buy"),
    Sell("Sell");
    
    private String value;
    InvoiceType(String value)
    {
        this.value=value;
    }
    
    
    public String toString()
    {
        return value;
    }
}


