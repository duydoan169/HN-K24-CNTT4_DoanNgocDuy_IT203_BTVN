public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        productRepository.add(new ElectronicProduct("SP001", "Dien thoai Iphone 100", 100000000, 10));
        productRepository.add(new ElectronicProduct("SP002", "Blu-ray player Buffalo", 6000000, 15));
        productRepository.add(new FoodProduct("SP003", "My cay cap do 200", 150000, 0));
        productRepository.add(new FoodProduct("SP004", "Bun ca hai phong", 35000, 50));

        // 1. Hiển thị toàn bộ danh sách sản phẩm
        System.out.println("Danh sach san pham: ");

        int n = productRepository.findAll().size();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            productRepository.findAll().get(i).displayInfo();
            System.out.println("Real price: " + productRepository.findAll().get(i).calculateFinalPrice());
            System.out.println("/n");
        }


    }
}
