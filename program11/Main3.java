package program11;

class Main3 {
    public static void main(String[] args) {
        // インスタンスを作成
        En3 en3 = new En3();
        
        // xとyの値を設定
        int xValue = 100;
        int yValue = 200;
        en3.setValues(xValue, yValue);

        // 合計値を計算
        int total = en3.calculateSum();

        // 結果を出力
        System.out.println(en3.getX() + " から " + en3.getY() + " までの合計値は" + total + "です。");
    }
}