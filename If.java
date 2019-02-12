import java.util.Random;

public class If {
    
    public static void main(String[] args) {
        Random rand = new Random(); // Creates RNG with random seed
        
        int num = rand.nextInt(10); // Gives a value between 0-9.
        int numBiggerRange = rand.nextInt(); // Gives potentially any value int
        
        if (num > 7) {
            System.out.println("I guess your number is either 8 or 9!");
        } else if (num > 5) {
            System.out.println("I guess your number is either 6 or 7!");
        } else {
            System.out.println("What a low number!");
        }
    }
    
}
