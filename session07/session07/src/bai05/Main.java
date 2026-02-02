package bai05;

public class Main {
    public static void main(String[] args) {
        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }


        // Thử thay đổi giá trị và quan sát lỗi biên dịch
        // Config.MAX_SCORE = 11;
    }
}
