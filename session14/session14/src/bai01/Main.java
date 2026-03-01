package bai01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> patientList = new LinkedHashSet<>();
        patientList.add("Nguyễn Văn A – Yên Bái");
        patientList.add("Trần Thị B – Thái Bình");
        patientList.add("Nguyễn Văn A – Yên Bái");
        patientList.add("Lê Văn C – Hưng Yên");

        System.out.println(patientList);

        System.out.println("Danh sách gọi khám:");
        for (String name : patientList) {
            System.out.println(name);
        }
    }
}