import java.time.LocalDateTime;
public class Customer {
    private String name;
    private LocalDateTime ordertime;
    private String order;
    public Customer (String name , LocalDateTime ordertime , String order){
        this.name = name;
        this.ordertime = ordertime;
        this.order = order;
    }
    public Customer(){
        this.name = "";
        this.ordertime = null;
        this.order = "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getOrder() {
        return order;
    }
    @Override
    public String toString() {
        return "order; " + this.order + "\n" +
        "placed by; " + this.name + "\n" + 
        "on; " + this.ordertime.toString();
    }
}

