package bai04;

public class Main {
    public static void main(String[] args) {

        Classroom s1 = new Classroom("Nguyen Van A");
        Classroom s2 = new Classroom("Nguyen Van B");
        Classroom s3 = new Classroom("Nguyen Van C");

        s1.contribute(100000);
        s2.contribute(150000);
        s3.contribute(200000);

        Classroom.showClassFund();
    }
}
