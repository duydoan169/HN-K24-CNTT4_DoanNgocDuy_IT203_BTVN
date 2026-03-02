package bai01;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack đang rỗng.");
            return null;
        }
        return history.pop();
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack đang rỗng.");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Stack đang rỗng.");
            return;
        }
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}