package program11;

public class Main7 {
    String name;
    String number;
    int japanese;
    int math;
    int english;

    public Main7(String n, String num, int ja, int ma, int en) {
        name = n;
        number = num;
        japanese = ja;
        math = ma;
        english = en;
    }
    // 合計点を計算するメソッド
    static double score_sum(int x, int y, int z){
        double sum = 0;
        sum = x + y + z;
        return sum;
    }
    static double score_avarage(int x, int y, int z){
        double avarage = 0;
        avarage = (x + y + z) / 3;
        return avarage;
    }
    
}
