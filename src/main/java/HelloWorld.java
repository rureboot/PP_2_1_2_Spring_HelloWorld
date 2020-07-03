import org.springframework.format.annotation.DateTimeFormat;

public class HelloWorld {
 private String message;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private int age;
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
}