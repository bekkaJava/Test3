public enum Sauce {
    EXTRACHEESESAUCE(5),
    BBQSAUCE(4),
    GARLICSAUCE(3),
    EXTRAHOTSAUCE(3);

    private final int price;

    Sauce(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }


}
