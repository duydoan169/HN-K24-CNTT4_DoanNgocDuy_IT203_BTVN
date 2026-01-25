import java.util.Scanner;

public class PTIT_CNTT4_IT203_Session01_Bai02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ : ");
        int n = sc.nextInt();

        System.out.print("Số lượng sách mượn : ");
        int m = sc.nextInt();

        double tienPhatGoc = n * m * 5000;

        double tienPhatSau = tienPhatGoc;
        if (n > 7 && m >= 3){
            tienPhatSau = tienPhatGoc * 120/100;
        }

        boolean khoaThe;
        if (tienPhatSau > 50000) {
            khoaThe = true;
        } else {
            khoaThe = false;
        }

        System.out.printf("Nhập số ngày chậm trễ : %d\n" ,n );
        System.out.printf("Nhập số lượng sách mượn : %d\n" ,m );
        System.out.printf("Tiền phạt gốc : %.1f\n" , tienPhatGoc);
        System.out.printf("Tiền phạt sau điều chỉnh : %.1f\n" , tienPhatSau);
        System.out.printf("Yêu cầu khóa thẻ : %s\n", khoaThe);

    }
}