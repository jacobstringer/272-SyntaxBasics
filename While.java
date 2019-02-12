import java.util.Random;

public class While {
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        while (rand.nextInt(100) > 20) {
            System.out.println("Hey look, I'm still going");
        } 
    }
    
}
