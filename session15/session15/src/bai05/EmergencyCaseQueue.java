package bai05;

import java.util.Queue;
import java.util.LinkedList;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.add(c);
    }
    public EmergencyCase getNextCase() {

        if (cases.isEmpty()) {
            System.out.println("Rỗng");
            return null;
        }
        return cases.poll();
    }
}