package bai02;

public class Bai02 {
    public static void main(String[] args) {
        Account acc = new Account("Duy", "123456789", "duy@gmail.com");

        acc.changePassword("987654321");
        acc.displayInfo();
    }
}
