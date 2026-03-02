package bai01;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        EditAction e1 = new EditAction("Thêm triệu chứng sốt", "10:00");
        EditAction e2 = new EditAction("Cập nhật kết quả xét nghiệm", "10:15");
        EditAction e3 = new EditAction("Thêm đơn thuốc", "10:30");

        history.addEdit(e1);
        history.addEdit(e2);
        history.addEdit(e3);

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        System.out.println(history.undoEdit());

        System.out.println("\nSau khi Undo:");
        history.displayHistory();
    }
}