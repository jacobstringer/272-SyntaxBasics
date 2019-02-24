import java.io.*;
import java.util.ArrayList;

public class FileIO {
    
    public static void main(String[] args) throws IOException {
		ArrayList<String> lines = loadFile(new File("FileIOSample.txt"));
		
		for(String str: lines) {
			System.out.println(str);
		}
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
