package bai03;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions = {"PUSH", "POP", "POP", "POP"};

        checker.checkProcess(actions);
    }
}