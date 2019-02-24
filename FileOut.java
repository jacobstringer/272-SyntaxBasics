import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOut {
    
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            lines.add(String.format("This is line %d", i)); // Works like printf
        }
        
        writeFile(new File("FileOutSample.txt"), lines); // Will create or replace file of this name in cwd
    }
	
	// For now there is no exception handling, we're just throwing it to the caller.
	private static void writeFile(File f, List<String> data) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(f));
		
        // Write each line
		for (String str: data) {
            out.write(str);
            out.newLine(); // It doesn't automatically add in a new line
        }
		
        out.close();
	}
    
}
