import java.time.LocalDateTime;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class Main {
    public static void main(String [] Args) {
        Queue <Customer> q = new LinkedList<Customer>();
        Stack <Customer> stack = new Stack<Customer>();
        q.add(enterCustomer());
        System.out.println(q.poll().toString());
    }
    public static Customer enterCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a customer");
        System.out.print("name; "); 
        String name = in.nextLine();
        while (name.isEmpty()){
            System.out.println("You cannot enter nothing for the customer");
            System.out.print("name; "); 
            name = in.nextLine();
        }
        System.out.print("order; "); 
        String order = in.nextLine();
        while (order.isEmpty()){
            System.out.println("You cannot enter nothing for the order");
            System.out.print("order; "); 
            order = in.nextLine();
        }
            LocalDateTime orderTime = LocalDateTime.now();
            return new Customer(name, orderTime, order);
    }
}