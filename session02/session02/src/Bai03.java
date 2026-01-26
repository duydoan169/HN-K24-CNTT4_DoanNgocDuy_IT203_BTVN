import java.util.Scanner;

public class Bai03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sach tra muon: ");
        int n = sc.nextInt();
        int total = 0;
        for(int i = 1; i<= n; i++){
            System.out.printf("Nhap so ngay tre cua cuon thu %d: ", i);
            total += sc.nextInt() * 5000;
        }
        System.out.println("Tong tien phat: " + total + " VND");
    }
}
