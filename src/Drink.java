public enum Drink {
    ORANGE_JUICE(5),
    APPLE_JUICE(4),
    PINEAPPLE_JUICE(6),
    LEMONADE(3);

    private final int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
