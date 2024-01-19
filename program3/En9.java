package program3;

import java.util.Scanner;

public class En9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("円の半径の長さ:");
        int metel = stdIn.nextInt();

        double area = metel * metel * 3.14;
        System.out.println(area);
    }
    
}
