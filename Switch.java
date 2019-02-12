import java.util.Random;

public class Switch {
    
    public static void main(String[] args) {
        Random rand = new Random(); // Creates RNG with random seed
        
        int num = rand.nextInt(10); // Gives a value between 0-9.
        int numBiggerRange = rand.nextInt(); // Gives potentially any value int
        
        System.out.println(num);
        
        switch(num) {
            case 8:
            case 9: {
                System.out.println("I guess your number is either 8 or 9!");
                break;
            }
            case 6:
            case 7: {
                System.out.println("I guess your number is either 6 or 7!");
                break;
            }
            default: {
                System.out.println("What a low number!");
            }
        } 
    }
    
}
