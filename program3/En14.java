package program3;

import java.util.Scanner;

public class En14 {
    public static void main(String[] args) {
        System.out.println("長方形の面積を求めます");

        Scanner stdIn = new Scanner(System.in);
        System.out.print("縦の長さ:");
        int vertical = stdIn.nextInt(); 
        System.out.print("横の長さ:");
        int horizontal = stdIn.nextInt();
        
        double area = vertical * horizontal;
        System.out.println("長方形の面積 = " + area);

    }
    
}
