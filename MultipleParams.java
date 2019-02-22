public class MultipleParams {
    
    public static void main(String[] args) {
        printer("Hey", "How's it going", "Oh look, I can pass in as many strings as I like");		
    }
	
	private static void printer(String... info) {
		for(String str: info) {
			System.out.println(str);
		}
	}
    
}
