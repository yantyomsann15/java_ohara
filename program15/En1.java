package program15;

import java.util.Scanner;

public class En1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // 整数を入力する
            System.out.print("整数1 = ");
            int num1 = scanner.nextInt();
            System.out.print("整数2 = ");
            int num2 = scanner.nextInt();
            // 少数の表示
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            // ０で割られたとき
            } catch (ArithmeticException e) {
                System.out.println("0による割り算です!!");
            } finally {
                System.out.println("処理終了");
            }
    }
}
