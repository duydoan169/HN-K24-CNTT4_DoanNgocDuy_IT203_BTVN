public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank(){
        if(score >= 8){
            return "Gioi";
        }else if(score >= 6.5){
            return "Kha";
        }else {
            return "Trung binh";
        }
    }

    public void showInfo(){
        System.out.println("ID: " + id + " Name: " + name + " Score: " + score);
    }
}
