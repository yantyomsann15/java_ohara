package program14;

import java.util.Scanner;

public class En4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を２つ入力してください。");

        System.out.print("１つ目文字列を入力:");
        String a = scanner.next();
        System.out.print("２つ目文字列を入力:");
        String b = scanner.next();

        if (a.equals(b))
            System.out.println("同じ文字列です。");
        else 
            System.out.println("違う文字列です。");

    }
    
}
