public class Variables1b {
	
	public static void main (String[] args) {
		long tooBigForInt = 10_000_000_000L;
		int overflowingInt = 10_000_000_000;
		
		System.out.printf("%d, %d", tooBigForInt, overflowingInt);
	}
}
