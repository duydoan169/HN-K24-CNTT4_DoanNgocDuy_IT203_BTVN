package bai03;

public class Main {
    public static void main(String[] args) {
        double [] score={8,2,1,9,2};
        System.out.println("diem trung binh:"+ScoreUtils.calculateAverage(score));
        for (double s:score){
            if(ScoreUtils.checkPass(s)){
                System.out.println(s+": dat");
            }else {
                System.out.println(s+": khong dat");
            }
        }
    }
}
