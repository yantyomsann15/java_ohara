package program14;

public class En5 {
    public static void main(String[] args) {
        // 内容
        String a = "東京都千代田区";
        String b = "神田神保町";

        // aの内容を構築
        StringBuilder c = new StringBuilder(a);
        // aの末尾にbをついか
        c.append(b);

        System.out.println(c);
    }
}
