public class Variables2 {
	
	public static void main (String[] args) {
		double decimal = 1.2;
		int first = 3, hex = 0xFFFF; // Hexadecimal for 2^16
		String text = "Hey there!";
		
		hex = hex + first; // Okay
		hex += first; // Another way to write the above line
		
		decimal += first; // double + int okay. Automatically casted
		
		text += first; // Also okay! The int is changed to a string and concatenated.
		
		System.out.printf("%f, %d, %d, %s", decimal, first, hex, text);
	}
}
