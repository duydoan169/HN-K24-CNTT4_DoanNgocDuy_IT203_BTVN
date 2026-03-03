public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        if(warrantyMonths > 12 ){
            return super.getPrice() + 1000000;
        }else {
            return super.getPrice();
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty months: " + warrantyMonths);
    }
}
