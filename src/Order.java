import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private List<Sauce> sauces;
    private List<Drink> drinks;

    public Order() {
        pizzas = new ArrayList<>();
        sauces = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public void removeSauce(Sauce sauce) {
        sauces.remove(sauce);
    }

    public void removeDrink(Drink drink) {
        drinks.remove(drink);
    }

    public void showPizzas() {
        pizzas.forEach(p -> System.out.println(p.getPizzaType().name()));

    }

    public void showSauces() {
        sauces.forEach(s -> System.out.println(s.name()));
    }

    public void showDrinks() {
        drinks.forEach(d -> System.out.println(d.name()));
    }

    public int totalAmount() {
        int totalAmount = 0;

        for (Pizza pizza : pizzas) {
            totalAmount += pizza.getAmount();
        }

        for (Sauce sauce : sauces) {
            totalAmount += sauce.getPrice();

        }
        for (Drink drink : drinks) {
            totalAmount += drink.getPrice();

        }

        if (pizzas.size() > 1) {
            totalAmount -= (pizzas.size() * Pizza.serviceFee) - Pizza.serviceFee;
        }
        System.out.print("Thank you for our service, Total_Amount is: ");
        return totalAmount;

    }

    @Override
    public String toString() {
        return "Order{" + "pizzas=" + pizzas + ", sauces=" + sauces + ", drinks=" + drinks + '}';
    }


}
