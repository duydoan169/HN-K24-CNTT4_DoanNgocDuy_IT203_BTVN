public class Bai04 {
    public static void sortBooks(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] books = {105, 102, 109, 101, 103};
        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(books);
        sortBooks(books);
        System.out.println("Mảng sau khi sắp xếp:");
        displayBooks(books);
    }
}
