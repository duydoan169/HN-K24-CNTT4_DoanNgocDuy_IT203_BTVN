package bai01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(
                List.of(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8)
        );

        Iterator<Double> iterator = arrayList.iterator();
        double sum = 0;
        int count = 0;
        while(iterator.hasNext()){
            double element = iterator.next();

            if(element >= 34.0 && element <= 42.0){
                System.out.print(element);
                if(iterator.hasNext()){
                    System.out.print(", ");
                }
                sum+=element;
                count++;
            }
        }
        System.out.println("\navg: " + sum/count);
    }
}
