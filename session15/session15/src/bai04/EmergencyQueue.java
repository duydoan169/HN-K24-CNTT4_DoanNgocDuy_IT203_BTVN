package bai04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p){
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
        } else {
            normalQueue.add(p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        }
        if (!normalQueue.isEmpty()) {
            return normalQueue.poll();
        }
        System.out.println("Queue rỗng");
        return null;
    }
    public void displayQueue() {

        System.out.println("Danh sách cấp cứu: ");
        for (EmergencyPatient p : emergencyQueue) {
            p.display();
        }
        System.out.println("Danh sách thường: ");
        for (EmergencyPatient p : normalQueue) {
            p.display();
        }
    }

}