import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;

    public Order() {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }


    public int totalAmount() {
        int totalAmount = 0;
        for (Pizza pizza : pizzas) {
            totalAmount += pizza.calculateAmount();
        }
        if (pizzas.size() > 1) {
            totalAmount -= 15;
        }
        System.out.print("Thank you for our service, Total_Amount is: ");
        return totalAmount;

    }


    @Override
    public String toString() {
        return "Order{" +
                "pizzas=" + pizzas +
                '}';
    }
}
