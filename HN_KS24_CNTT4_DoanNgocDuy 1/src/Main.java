import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int choice;
        String[] arr = new String[100];
        int length = 0;
        do {
            printMenu();
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    showStudentList(arr, length);
                    break;
                case 2:
                    addStudent(arr, length);
                    length++;
                    break;
                case 3:
                    updateStudent(arr, length);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Khong hop le");
            }
        }while(choice != 6);
    }

    static void printMenu(){
        System.out.println("==========Menu==========");
        System.out.println("1. Hien thi danh sach MSSV");
        System.out.println("2. Them moi MSSV");
        System.out.println("3. Cap nhat MSSV");
        System.out.println("4. Xoa MSSV");
        System.out.println("5. Tim kiem MSSV");
        System.out.println("6. Thoat");
        System.out.println("==========Menu==========");
    }

    static void showStudentList(String[] arr, int length){
        System.out.println("Danh sach MSSV: ");
        if (length == 0){
            System.out.println("Danh sach rong");
        }else {
            for (int i = 0; i < length; i++) {
                System.out.println("arr[" + i + "]: " + arr[i]);
            }
        }
    }

    static void addStudent(String[] arr, int length){
        String studentId;
        do{
            System.out.println("Nhap MSSV (VD: B1234567): ");
            studentId = sc.nextLine();
            if (!studentId.matches("^B\\d{7}$")){
                System.out.println("Khong hop le, yeu cau nhap lai");
            }else {
                arr[length] = studentId;
                System.out.println("Them MSSV thanh cong");
            }
        }while (!studentId.matches("^B\\d{7}$"));
    }

    static void updateStudent(String[] arr, int length){
        int position;
        do {
            System.out.println("Nhap vi tri muon sua: ");
            position = sc.nextInt();
            if(position > length || position < 0){
                System.out.println("Khong hop le, yeu cau nhap lai");
            }
        }while (position > length || position < 0);
        String studentId;
        do{
            System.out.println("Nhap MSSV sau khi sua: ");
            studentId = sc.nextLine();
            if (!studentId.matches("^B\\d{7}$")){
                System.out.println("Khong hop le, yeu cau nhap lai");
            }else {
                arr[length] = studentId;
                System.out.println("Sua MSSV thanh cong");
            }
        }while (!studentId.matches("^B\\d{7}$"));
    }


}
