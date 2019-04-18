
public class ItemNotFoundException extends Exception {
    private int item_error;


    public ItemNotFoundException(int item_input){
        super();
        this.item_error=item_input;

    }

    public String getExMessage(){
        return super.getMessage() + "Item ID : " + item_error + " not found.";
    }
}
