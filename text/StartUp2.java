package text;

public class StartUp2 {
    public static void main(String[] args) {
        Player[] a = new Player[2]; 
        a[0] = new VideoPlayer();
        a[1] = new CDPlayer();

        for(Player p : a){
            p.play();
            p.stop();
            System.out.println();
        }
    }
    
}
