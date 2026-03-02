package bai05;

public class Main {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase("An");
        EmergencyCase case2 = new EmergencyCase("Huy");

        queue.addCase(case1);
        queue.addCase(case2);

        EmergencyCase current = queue.getNextCase();

        if (current != null) {

            System.out.println(current);

            current.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
            current.addStep(new TreatmentStep("Chẩn đoán", "08:10"));
            current.addStep(new TreatmentStep("Điều trị", "08:20"));

            current.displaySteps();

            System.out.println("\nHoàn tác bước gần nhất:");
            System.out.println(current.undoStep());

            System.out.println("\nSau khi hoàn tác:");
            current.displaySteps();
        }
    }
}