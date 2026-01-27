import java.util.Scanner;

public class Bai02 {
    static Scanner sc = new Scanner(System.in);
    public static int searchBooks(String[] arr, String search){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(search)){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        String[] books = {"Book 1", "Book 2", "Book 3", "Book 4", "Book 5"};
        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();
        int res = searchBooks(books, search);
        if (res == -1){
            System.out.println("Sách không tồn tại");
        }else {
            System.out.printf("Tìm thấy tại vị trí %d", res);
        }
    }
}
