package bai06;

public class Main {
    public static void main(String[] args) {

        // BỆNH NHÂN CHỜ KHÁM (Queue – FIFO)
        System.out.println("BỆNH NHÂN CHỜ KHÁM");

        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();

        waitingQueue.addPatient(new Patient("BN01", "An", 25, "Nam"));
        waitingQueue.addPatient(new Patient("BN02", "Bình", 30, "Nữ"));

        System.out.println("Gọi khám: " + waitingQueue.callNextPatient());
        System.out.println("Còn lại: " + waitingQueue.getTotalPatients());

        //LỊCH SỬ CHỈNH SỬA BỆNH ÁN (Stack – LIFO)
        System.out.println("LỊCH SỬ BỆNH ÁN");

        MedicalRecordHistory history = new MedicalRecordHistory("HS01");

        history.addEdit(new EditAction("Sửa triệu chứng", "Bác sĩ A", "08:00"));
        history.addEdit(new EditAction("Cập nhật thuốc", "Bác sĩ B", "08:15"));

        System.out.println("Hoàn tác: " + history.undoLastEdit());


        //HỆ THỐNG GỌI SỐ TỰ ĐỘNG (Queue)
        System.out.println("HỆ THỐNG GỌI SỐ");

        TicketSystem ticketSystem = new TicketSystem();

        ticketSystem.issueTicket("08:00");
        ticketSystem.issueTicket("08:05");

        System.out.println("Gọi số: " + ticketSystem.callNextTicket());


        //HOÀN TÁC THAO TÁC NHẬP LIỆU (Undo – Stack)
        System.out.println("UNDO NHẬP LIỆU");

        UndoManager undoManager = new UndoManager(5);

        undoManager.addAction(new InputAction("Tên", "An", "Anh An", "09:00"));
        undoManager.addAction(new InputAction("Tuổi", "25", "26", "09:05"));

        System.out.println("Undo: " + undoManager.undo());
    }
}
