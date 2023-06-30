public class Pizza {
    private int amount;
    private PizzaType pizzaType;


    Pizza(PizzaType pizza) {
        this.pizzaType = pizza;
        this.amount = pizza.getPrice() + Order.getServiceFee();
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
