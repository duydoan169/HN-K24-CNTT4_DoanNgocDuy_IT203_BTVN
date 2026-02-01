package bai03;

public class Product {
    private int productId ;
    private String productName;
    private int price;

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void priceSetter(int newPrice){
        if(newPrice > 0){
            this.price = newPrice;
        }else {
            System.out.println("Khong hop le");
        }
    }
}
