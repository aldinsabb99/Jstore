package Jstore;
public class ItemAlreadyExistsException extends Exception{
    private Item item_error;


    public ItemAlreadyExistsException(Item item_input){
        super("====Item Already Exists====\nItem Name : ");
        this.item_error=item_input;
        getMessage();
    }

    public String getMessage(){
        return super.getMessage() + item_error.getName() + " ,Category: " + item_error.getCategory() + " ,Status: " + item_error.getStatus() + " from: " + item_error.getSupplier().getName() + " already exists.";
    }
}
