package program14;

import java.util.Scanner;

public class En3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Shift-JIS");
        System.out.print("文字列を入力:");
        String str1 = scanner.nextLine();
        
        // 文字列を構築
        StringBuilder str2 = new StringBuilder(str1);

        // 11文字以降削除するため
        if (str2.length() >= 11){
        str2.setLength(10);
        }
        System.out.println("結果文字列:" + str2.toString());
    }
}
