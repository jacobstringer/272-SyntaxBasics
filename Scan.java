import java.util.Scanner;

public class Scan {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		System.out.println("Hi " + in.nextLine() + "!");
	}
}
