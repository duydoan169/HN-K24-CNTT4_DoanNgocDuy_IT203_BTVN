import java.util.Scanner;

public class PTIT_CNTT4_IT203_Session01_Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia bia: ");
        double price = sc.nextDouble();

        System.out.print("Sach con khong? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int age = 2026 - publishYear;

        System.out.println("-----Phieu thong tin sach-----");
        System.out.println("Ma sach: " + bookID);
        System.out.println("Ten sach: " + bookName.toUpperCase());
        System.out.println("Nam xuat ban: " + publishYear);
        System.out.printf("Gia bia: %.2f\n", price);
        System.out.println("Tuoi tho sach: " + age);

        if (isAvailable) {
            System.out.println("Con sach");
        } else {
            System.out.println("Het sach");
        }
    }
}

