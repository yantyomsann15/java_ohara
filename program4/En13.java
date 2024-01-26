package program4;

import java.util.Scanner;

public class En13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("0~100までの得点（整数値）を入力してください:");
        int score = stdIn.nextInt();

        if (score > 100 || score < 0)
          System.out.println("入力値が不正です");
        else if (score == 100)
          System.out.println("満点合格です");
        else if (score < 100 || score >= 60)
          System.out.println("合格です");
        else if (score < 60)
          System.out.println("不合格です");
    }
    
}
