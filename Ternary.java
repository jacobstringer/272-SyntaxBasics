public class Ternary {
    
    public static void main(String[] args) {
        System.out.printf("%d, %d, %d", myAbs(8), myAbs(-4), myAbs(0));
    }
	
	// A function for getting the absolute value
	private static int myAbs(int num) {
		return (num < 0) ? -num : num;
	}
    
}
