public class Bai06 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                c[k++] = b[i];
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = c[i];
        }

        return result;
    }

    public static void displayBooks(int[] arr) {
        Bai04.displayBooks(arr);
    }

    public static void main(String[] args) {

        int[] arrayFirst = {1, 3, 5, 6, 7};
        int[] arraySecond = {3, 2, 4, 6};

        int[] merged = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sach sach hoan chinh:");
        displayBooks(merged);
    }
}
