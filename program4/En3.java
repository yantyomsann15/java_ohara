package program4;

import java.util.Scanner;

public class En3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0~100までの得点（整数値）を2つ入力してください");
        System.out.print("国語の得点:"); int score1 = stdIn.nextInt();
        System.out.print("英語の得点:"); int score2 = stdIn.nextInt();

        if (score1 >= 80 && score2 >= 80)
          System.out.println("2科目とも合格です");
        else
          System.out.println("");
    }
    
}
