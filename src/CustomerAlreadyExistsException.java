public class CustomerAlreadyExistsException extends Exception{
    private Customer customer_error;


    public CustomerAlreadyExistsException(Customer customer_input){
        super("====Customer Already Exists====\nCustomer Email : ");
        this.customer_error=customer_input;
        getMessage();
    }

    public String getMessage(){
        return super.getMessage() + customer_error.getEmail() + " ,or Username:"+ customer_error.getUsername() + " already exists.";
    }
}
