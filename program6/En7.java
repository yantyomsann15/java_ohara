package program6;

public class En7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " の段");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        
    }
    
}
