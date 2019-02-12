import java.util.Random;

public class DoWhile {
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        do {
            System.out.println("This will always happen at least once!");
        } while (rand.nextInt(100) > 20);
    }
    
}
