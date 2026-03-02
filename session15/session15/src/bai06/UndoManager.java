package bai06;

import java.util.Stack;

public class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {

        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0); // bỏ thao tác cũ nhất
        }

        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) return null;
        return undoStack.pop();
    }
}