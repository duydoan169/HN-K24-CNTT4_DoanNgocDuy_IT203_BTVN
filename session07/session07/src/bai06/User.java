package bai06;

public class User {
    private final int id;
    private String username;
    private String password;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void showInfo(){
        System.out.println("Id: " + id + " Username: " + username + " Password: " + password);
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
