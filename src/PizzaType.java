public enum PizzaType {
    MARGHERITA(33),
    PEPPERONI(35),
    VEGGIE(35),
    SICILIAN(40),
    CHICAGO(38),
    DIABLO(41),
    SEAFOOD(45),
    NEW_YORK(47),
    CHICKEN_BBQ(30);


    private final int price;


    PizzaType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "PizzaType{" +
                "price=" + price +
                '}';
    }
}


