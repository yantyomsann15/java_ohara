package program8;

import java.util.Arrays;
import java.util.Scanner;

public class En3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "件目:整数を入力 = ");
            numbers[i] = scanner.nextInt();
        }

        int[] evenNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
        int[] oddNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();

        System.out.println("偶数値配列 = " + Arrays.toString(evenNumbers));
        System.out.println("奇数値配列 = " + Arrays.toString(oddNumbers));
    }
    
}
