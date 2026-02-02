package bai03;

class ScoreUtils{
    public static boolean checkPass(double score){
        return score>=5;
    }
    public static int calculateAverage(double[] scores){
        int sum=0;
        for (double s:scores){
            sum+=s;
        }
        return sum/scores.length;
    }
}