package text;

public class Point extends Shape {
    // 抽象クラス
    public Point() {
    }
        @Override public String toString() {
            return "Point";
        }

       @Override public void draw() {
            System.out.println('+');
        }
    }
