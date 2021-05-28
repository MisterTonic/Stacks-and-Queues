import java.util.Queue;
import java.util.LinkedList;
class Main {
    public static void main(String [] Args) {
        Queue <Customer> q = new LinkedList<Customer>();
        q.add(new Customer());
        q.add(new Customer());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}