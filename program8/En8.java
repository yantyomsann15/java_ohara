package program8;

import java.util.Scanner;

public class En8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " つ目の整数値:");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            
            }
        }

        System.out.println("最大値:" + max);
        System.out.println("最小値:" + min);
    }
    
}
