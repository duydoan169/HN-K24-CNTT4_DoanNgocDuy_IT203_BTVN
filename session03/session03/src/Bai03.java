public class Bai03 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = 0;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] > max) {
                max = quantities[i];
            }
        }
        for(int i = 0; i< quantities.length; i++){
            if(quantities[i] == max){
                System.out.printf("Ten sach: %s, So luong: %d \n", names[i], quantities[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = 10000;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] < min) {
                min = quantities[i];
            }
        }
        for(int i = 0; i < quantities.length; i++){
            if(quantities[i] == min){
                System.out.printf("Ten sach: %s, So luong: %d \n", names[i], quantities[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] names = new String[] {"Book 1" , "Book 2" , "Book 3" , "Book 4" , "Book 5"};
        int[] quantities = new int[] {1, 2, 3, 5, 1};
        System.out.println("Sach co so luong lon nhat:");
        maxQuantityOfBooks(names , quantities);
        System.out.println("Sach co so luong it nhat:");
        minQuantityOfBooks(names,quantities);
    }
}

