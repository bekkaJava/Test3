public class Pizza {
    private int amount;
    private PizzaType pizzaType;
    private static final int extraCheesePrice = 5;
    private static final int extraTopicsPrice = 10;
    private static final int serviceFee = 15;


    Pizza(PizzaType pizza) {
        this.pizzaType = pizza;
        this.amount = pizza.getPrice() + serviceFee;
    }


    public void addExtraCheese() {
        System.out.println("ExtraCheese added on " + pizzaType.name());
        this.amount += extraCheesePrice;
    }

    public void addExtraTopics() {
        System.out.println("ExtraTopics added on " + pizzaType.name());
        this.amount += extraTopicsPrice;
    }

    public void getServiceFee() {
        System.out.println("Service fee is :" + serviceFee);
    }

    public void getExtraCheesePrice() {
        System.out.println("ExtraCheese Price is :" + extraCheesePrice);
    }

    public void getExtraTopicsPrice() {
        System.out.println("ExtraTopics price is :" + extraTopicsPrice);
    }

    public int calculateAmount() {
        return this.amount;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "amount=" + amount +
                ", pizzaType=" + pizzaType +
                '}';
    }
}
