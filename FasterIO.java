import java.io.*;

public class FasterIO {
	
	public static void main (String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		in.close(); // Good habit to close streams
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		out.write(input);
		out.close(); // If you don't do this, it won't flush its buffer and it might not print before the programme ends
	}
}
