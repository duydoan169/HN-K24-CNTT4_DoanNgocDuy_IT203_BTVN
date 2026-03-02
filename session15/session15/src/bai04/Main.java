package bai04;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("BN01", "An", 2));
        queue.addPatient(new EmergencyPatient("BN02", "Huy", 1));
        queue.addPatient(new EmergencyPatient("BN03", "Thành", 2));
        queue.addPatient(new EmergencyPatient("BN04", "Dương", 1));

        queue.displayQueue();

        System.out.println("Gọi khám:");
        EmergencyPatient next = queue.callNextPatient();
        next.display();
    }
}