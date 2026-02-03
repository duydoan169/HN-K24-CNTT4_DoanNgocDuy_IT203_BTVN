import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        Student[] students = new Student[100];
        int pos = 0;
        do{
            printMenu();
            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhap so luong sinh vien muon them: ");
                    int n = sc.nextInt(); sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        int check = 0;
                        do {
                            System.out.println("Nhap ma sinh vien(VD: SV123): ");
                            String studentId = sc.nextLine();
                            if(!studentId.matches("SV\\d{3}")){
                                System.out.println("Ma sinh vien phai bat dau voi SV va ket thuc voi 3 chu so");
                                check = 1;
                                continue;
                            }
                            System.out.println("Nhap ten sinh vien: ");
                            String studentName = sc.nextLine();
                            if(studentName.isBlank()){
                                System.out.println("Ten sinh vien khong duoc de trong");
                                check = 1;
                                continue;
                            }

                            System.out.println("Nhap diem so sinh vien: ");
                            double studentScore = sc.nextDouble(); sc.nextLine();
                            if(studentScore < 0 || studentScore > 10){
                                System.out.println("Diem so khong duoc am hoac lon hon 10");
                                check = 1;
                                continue;
                            }
                            students[pos++] = new Student(studentId, studentName, studentScore);
                            check = 0;
                        }while(check != 0);
                    }
                    break;
                case 2:
                    for (int i = 0; i < pos; i++) {
                        students[i].showInfo();
                    }
                    break;
                case 3:
                    System.out.println("Nhap hoc luc muon tim: ");
                    String search = sc.nextLine();
                    System.out.println("Ket qua tim kiem cho " + search + ": ");
                    int count = 0;
                    for (int i = 0; i < pos; i++) {
                        if (students[i].getRank().equals(search)){
                            students[i].showInfo();
                            count++;
                        }
                    }
                    if (count == 0){
                        System.out.println("Khong co ket qua tim kiem");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Da thoat chuogn trinh");
                    break;
                default:
                    System.out.println("Khong hop le! Nhap lai");
            }
        } while (choice != 5);
    }

    static void printMenu(){
        System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.println("==================================");
    }
}
