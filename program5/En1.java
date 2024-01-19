package program5;

import java.util.Scanner;

public class En1 {  
    public static void main(String[] args) {
        // Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーに対してメッセージを表示
        System.out.println("A~Dの値を入力してください:");

        // ユーザーの入力を受け取る
        String rank = scanner.next();

        // 入力された値に基づいて条件分岐
        switch (rank) {
            case "A":
                System.out.println("ランクAは評価「優」です");
                break;
            case "B":
                System.out.println("ランクBは評価「良」です");
                break;
            case "C":
                System.out.println("ランクCは評価「可」です");
                break;
            case "D":
                System.out.println("ランクDは評価「不可」です");
                break;
            default:
                System.out.println("A~Dの値を入力してください");
        }
    }
}
