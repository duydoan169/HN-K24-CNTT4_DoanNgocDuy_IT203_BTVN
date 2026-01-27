import java.util.Scanner;

public class Bai01 {
    static Scanner sc = new Scanner(System.in);
    public static int[] addBookToLibraries (int n){
        int[] arr = new int[n];
        System.out.print("Nhap ma so cho " + n + " cuon sach\n");
        for(int i= 0; i < n; i++ ){
            System.out.printf("Sach thu %d: ", i+1);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void displayLibraries(int[] arr){
        System.out.println("---Ket Qua---");
        System.out.print("Danh sach ma sach:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(i == arr.length-1 ? " %d" : " %d,", arr[i]);
        }
    }
    public static void main (String[] args){
        System.out.print("Nhap so ma sach muon nhap: ");
        int n = sc.nextInt();
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
    }
}
