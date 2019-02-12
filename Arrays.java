public class Arrays {
    
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Sets aside five places for ints, no numbers included yet
        
        for (int num: numbers) {
            System.out.printf("%d ", num); // prints:0 0 0 0 0 
        }
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = 5 + i;
        }
        
        for (int num: numbers) {
            System.out.printf("%d ", num); // prints:5 6 7 8 9 
        }
    }
    
}
