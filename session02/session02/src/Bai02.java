import java.util.Scanner;

public class Bai02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap khu vuc (A, B, C, D): ");
        String choice = sc.nextLine();
        switch (choice){
            case "A":
                System.out.println("Vi tri : Tang 1 - Sach Van hoc");
                break;
            case "B":
                System.out.println("Vi tri : Tầng 2 - Sách Khoa học");
                break;
            case "C":
                System.out.println("Vi tri : Tầng 3 - Sách Ngoại ngữ");
                break;
            case "D":
                System.out.println("Vi tri : Tầng 4 - Sách Tin học");
                break;
            default:
                System.out.println("Loi : Ma khu vuc khong hop le");
        }
    }
}
