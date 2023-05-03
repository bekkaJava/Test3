public class Pizza {
    private int amount;
    private PizzaType pizzaType;
    public static final int serviceFee = 10;


    Pizza(PizzaType pizza) {
        this.pizzaType = pizza;
        this.amount = pizza.getPrice() + serviceFee;
    }


    public int getAmount() {
        return this.amount;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "amount=" + amount +
                ", pizzaType=" + pizzaType +
                '}';
    }
}
