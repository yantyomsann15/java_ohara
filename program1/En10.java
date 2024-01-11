package program1;

import java.util.Scanner;

public class En10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");
        System.out.print("文字の入力:");
        String str = stdIn.next();
        System.out.print("整数の入力:");
        String aaa = stdIn.next();
        System.out.print("小数の入力:");
        String bbb = stdIn.next();

        System.out.println("入力された文字＝" + str);
        System.out.println("入力された整数＝" + aaa);
        System.out.println("入力された小数＝" + bbb);
    }
    
}
