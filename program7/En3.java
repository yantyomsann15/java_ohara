package program7;

import java.util.Scanner;

public class En3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int x;
        do {
            System.out.print("整数値を入力:");
            x = stdIn.nextInt();
        } while (x <= 0);

        System.out.print("");
        while (x > 0) {
            System.out.print(x % 10);
            x /= 10;
        }
    }
    
}
