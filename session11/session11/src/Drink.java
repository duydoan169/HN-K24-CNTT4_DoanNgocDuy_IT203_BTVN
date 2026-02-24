public abstract class Drink {
    private String id;
    private String name;
    private int price;

    public Drink(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();

    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public Drink() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
