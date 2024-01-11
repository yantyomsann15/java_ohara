package program1;

import java.util.Scanner;

public class En11 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in,"Shift-JIS");
        System.out.print("年:");
        String ccc = stdIn.next();
        System.out.print("月:");
        String aaa = stdIn.next();
        System.out.print("日:");
        String bbb = stdIn.next();

        System.out.println(ccc + "/" + aaa + "/" + bbb);
        }
    }
