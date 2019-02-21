public class Variables4 {
	
	public static void main (String[] args) {
		// Prints out: 0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz
		for (char c = '0'; c <= 'z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		
		// Prints out: ABCDEFGHIJKLMNOPQRSTUVWXYZ
		for (char c = 65; c < 91; c++) {
			System.out.print(c);
		}
		
	}
}
