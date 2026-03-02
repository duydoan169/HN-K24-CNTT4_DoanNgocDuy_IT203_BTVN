package bai05;

import java.util.Stack;

public class EmergencyCase {

    private String patientName;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(String patientName) {
        this.patientName = patientName;
        this.steps = new Stack<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Stack<TreatmentStep> getSteps() {
        return steps;
    }

    public void setSteps(Stack<TreatmentStep> steps) {
        this.steps = steps;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
    }
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Rỗng");
            return null;
        }
        return steps.pop();
    }
    public void displaySteps() {
        System.out.println("Bệnh nhân: " + patientName);
        System.out.println("Các bước xử lý:");
        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }
}