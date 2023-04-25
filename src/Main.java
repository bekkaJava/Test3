import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Pizza pizza = new Pizza(PizzaType.PEPPERONI);
        Pizza pizza2 = new Pizza(PizzaType.MARGHERITA);
        order.addPizza(pizza);
        order.addPizza(pizza2);
        System.out.println(order.totalAmount());


    }
}
