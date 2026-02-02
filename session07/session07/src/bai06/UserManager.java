package bai06;

public class UserManager {
    private static User[] userList = new User[100];
    private static int count = 0;

    public static void addUser(User user) {
        if (count >= userList.length) {
            return;
        }

        userList[count++] = user;
    }

    public static boolean checkLogin(String username, String password){
        for (int i = 0; i < count; i++) {
            if(userList[i].getUsername().equals(username) && userList[i].getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public static void showList(){
        for (int i = 0; i < count; i++) {
            userList[i].showInfo();
        }
        System.out.println();
    }
}
