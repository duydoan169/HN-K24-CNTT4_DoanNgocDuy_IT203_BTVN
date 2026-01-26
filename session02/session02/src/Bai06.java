import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityBook, tempMax = 0, tempMin = 0, count = 0;
        float avgDay = 0;
        for(int i = 2 ; i <= 8 ; i++){
            if(i == 8){
                System.out.println("Moi luot muon ngay Chu nhat : ");
            }else {
                System.out.println("Moi luot muon ngay thu : " + i);
            }
            quantityBook = sc.nextInt();
            if (quantityBook == 0){
                continue;
            }else {
                ++count;
            }
            if(count == 1){
                tempMax = quantityBook;
                tempMin = quantityBook;
            }
            if(quantityBook > tempMax) {
                tempMax = quantityBook;
            }
            if (quantityBook < tempMin) {
                tempMin = quantityBook;
            }
            avgDay += quantityBook;
        }

        System.out.println("---- KET QUA THONG KE ----");
        System.out.println("Luot muon cao nhat : " + tempMax);
        System.out.println("Luot muon thap nhat : " + tempMin);
        System.out.println("trung binh luot muon/ngay : " + (avgDay/count));
    }
}
