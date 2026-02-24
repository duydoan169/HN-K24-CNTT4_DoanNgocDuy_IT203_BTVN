public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee( "D001", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice( "D002", "Nước cam", 40000, 10);
        drinks[2] = null;

        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                System.out.println("Thanh tien: " + drinks[i].calculatePrice());
                if (drinks[i] instanceof IMixable) {
                    ((IMixable) drinks[i]).mix();
                }
            }else {
                continue;
            }
            System.out.println("\n");
        }
    }
}
