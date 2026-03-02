package bai02;


import java.util.Queue;
import java.util.LinkedList;

public class PatientQueue {

    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p) {
        queue.add(p);
    }

    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống");
            return null;
        }
        return queue.poll();
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống");
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống");
            return;
        }
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}