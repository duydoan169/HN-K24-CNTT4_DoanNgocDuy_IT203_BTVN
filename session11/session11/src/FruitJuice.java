public class FruitJuice extends Drink implements IMixable{
    private int discountPercent;

    public FruitJuice(String id, String name, int price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        int price = getPrice();
        return price - ((double) (price * discountPercent) /100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}
