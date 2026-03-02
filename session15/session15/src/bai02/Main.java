package bai02;

public class Main {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 30);
        Patient p2 = new Patient("BN02", "Trần Thị B", 25);
        Patient p3 = new Patient("BN03", "Lê Văn C", 40);

        pq.addPatient(p1);
        pq.addPatient(p2);
        pq.addPatient(p3);

        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nGọi khám:");
        System.out.println(pq.callNextPatient());

        System.out.println("\nSau khi gọi khám:");
        pq.displayQueue();
    }
}