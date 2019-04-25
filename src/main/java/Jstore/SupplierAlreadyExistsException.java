package Jstore;
public class SupplierAlreadyExistsException extends Exception{
    private Supplier supplier_error;


    public SupplierAlreadyExistsException(Supplier supplier_input){
        super("====Supplier Already Exists====\nSupplier Email : ");
        this.supplier_error=supplier_input;
        getMessage();
    }

    public String getMessage(){
        return super.getMessage() + supplier_error.getEmail() + " ,or phoneNumber: " + supplier_error.getPhoneNumber()+" already exists.";

    }

}
