import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIO2 {
    
    public static void main(String[] args) throws IOException {
		ArrayList<String> lines = loadFile(new File("FileIOSample.txt"));
		
		int[] integers = cast2Ints(lines.get(1));
		double[] doubles = cast2Doubles(lines.get(2));
		
		double sum = 0.0;
		for(int i: integers) // If there's only one line, you don't need the {} with if/for statements
			sum += i;
		
		for (double d: doubles)
			sum += d;
		
		System.out.println(sum);
    }
	
	private static int[] cast2Ints(String line) {
		String[] temp = line.split(" "); // Split line on whitespace
		int[] results = new int[temp.length]; // Get new array ready
		
		for (int i = 0; i < temp.length; i++) {
			results[i] = Integer.parseInt(temp[i]); // Parse each element from String to int
		}
		
		return results;
	}
	
	private static double[] cast2Doubles(String line) {
		String[] temp = line.split(" "); // Split line on whitespace
		double[] results = new double[temp.length]; // Get new array ready
		
		for (int i = 0; i < temp.length; i++) {
			results[i] = Double.parseDouble(temp[i]); // Parse each element from String to double
		}
		
		return results;
	}
	
	// For now there is no exception handling, we're just throwing it to the caller.
	private static ArrayList<String> loadFile(File f) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f));
		
		// Let's input this stuff. At first it's all strings
		ArrayList<String> lines = new ArrayList<>();
		String temp;
		while ((temp = in.readLine()) != null) { // Tricky line, first assign, then check assigned variable!
			lines.add(temp);
		}
		
        in.close();
		return lines;
	}
    
}
