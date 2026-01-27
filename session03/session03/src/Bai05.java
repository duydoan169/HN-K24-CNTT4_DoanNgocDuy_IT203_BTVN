import java.util.Scanner;

public class Bai05 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Khong tim thay sach");
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Da xoa sach co ma: " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;

        while (n != 0) {
            System.out.println("Danh sach hien tai:");
            displayBooks(books, n);

            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int bookId = sc.nextInt();

            if (bookId == 0) {
                break;
            }

            n = deleteBook(books, n, bookId);
        }
    }
}
