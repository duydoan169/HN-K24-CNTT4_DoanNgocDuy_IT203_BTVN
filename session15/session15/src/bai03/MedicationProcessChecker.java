package bai03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            if (actions[i].equals("PUSH")) {
                stack.push("phát thuốc");
            }else if(actions[i].equals("POP")){
                if (stack.isEmpty()) {
                    System.out.println("POP Khi Stack rỗng");
                    return false;
                }
                stack.pop();
            }

        }
        if (stack.isEmpty()) {
            System.out.println("Hợp Lệ");
            return true;
        } else {
            System.out.println("Còn thuốc chưa hoàn tất");
            return false;
        }
    }
    public void reset(){
        stack.clear();
    }
}