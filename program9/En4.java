package program9;

import java.util.Scanner;

public class En4 {
    public static int triple(int num){
        return num * 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください:");
        int number = scanner.nextInt();

        int result = triple(number);

        System.out.println(number + "の9倍は" + (result * 3) + "です。");

    }
    
}
