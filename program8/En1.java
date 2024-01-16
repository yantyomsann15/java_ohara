package program8;

public class En1 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i + 1;
        }
        for (int i = 0; i < 10; i ++) {
            System.out.println("list[" + i + "] = " + num[i]);
        }
    }
    
}
