package bai06;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Nguyen Van A", "123456");
        User user2 = new User(2, "Nguyen Van B", "123457");
        User user3 = new User(3, "Nguyen Van C", "123458");

        UserManager.addUser(user1);
        UserManager.addUser(user2);
        UserManager.addUser(user3);

        // nhap dung thong tin
        UserManager.showList();
        if(UserManager.checkLogin("Nguyen Van A", "123456")){
            System.out.println("Dang nhap thanh cong");
        }else {
            System.out.println("Dang nhap that bai");
        }

        // nhap sai thong tin
        if(UserManager.checkLogin("Nguyen Van B", "")){
            System.out.println("Dang nhap thanh cong");
        }else {
            System.out.println("Dang nhap that bai");
        }
    }
}
