package bai06;

public class Bai06 {
    public static void main(String[] args) {
        User user = new User(1, "Duy", "123456789", "Duy@gmail.com");
        user.showInfo();

        User invalidUser1 = new User(2, "Doan", "", "Doan@gmail.com");
        User invalidUser2 = new User(3, "Ngoc", "123456789", "Ngoc@gmail");
    }
}
