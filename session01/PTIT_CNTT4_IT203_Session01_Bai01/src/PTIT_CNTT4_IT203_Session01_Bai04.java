import java.util.Scanner;

public class PTIT_CNTT4_IT203_Session01_Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (usd): ");
        double priceUSD = sc.nextDouble();
        System.out.print("Nhập tỷ giá: ");
        float rate = sc.nextFloat();

        double priceVND = priceUSD * rate;

        long priceVNDRounded = (long) priceVND;

        System.out.printf("Tổng tiền VNĐ : %d " ,priceVNDRounded);
    }
}