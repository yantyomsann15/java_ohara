package program7;

public class En4 {
    public static void main(String[] args) {
        int total = 0;
        int n = 1;

        while (total <= 100000) {
            total += n;
            n++;
        }

        System.out.println("合計が100000を超えるnは" + (n - 1) + "です");
    }
    
}
