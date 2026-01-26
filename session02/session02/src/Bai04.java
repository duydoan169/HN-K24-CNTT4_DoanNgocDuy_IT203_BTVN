import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ID ;
        do {
            System.out.print("nhap ma sach moi: ");
            ID = scanner.nextInt();
            if (ID <= 0){
                System.out.println("ma khong hop le, nhap lai: ");
            }
        }while (ID <= 0);
        System.out.printf("ma sach %d da duoc ghi nhan", ID);
    }
}
