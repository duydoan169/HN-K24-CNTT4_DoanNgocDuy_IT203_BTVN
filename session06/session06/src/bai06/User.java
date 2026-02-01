package bai06;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public void setPassword(String password) {
        if (password == null || password.isBlank()) {
            System.out.println("Mat khau khong hop le");
            return;
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches(".+@.+\\..+")) {
            System.out.println("Email khong hop le");
            return;
        }
        this.email = email;
    }


    public void showInfo(){
        System.out.println("Id: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******\n");
    }
}
