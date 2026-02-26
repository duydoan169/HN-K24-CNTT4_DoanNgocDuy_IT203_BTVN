package bai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hospital = new ArrayList<>(
                List.of("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen")
        );


        System.out.println(" danh sách loại thuốc : " + hospital);

        ArrayList<String> newHospital = new ArrayList<>();

        for (String e : hospital){
            if(!newHospital.contains(e)){
                newHospital.add(e);
            }
        }
        Collections.sort(newHospital);

        System.out.println("danh sách sau khi lọc trùng và sắp xếp : "+newHospital);
    }
}
