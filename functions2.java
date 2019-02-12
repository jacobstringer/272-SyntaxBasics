public class Functions2 {
    
    public static void main(String[] args) {
        System.out.println(repeatString("Ho ", 3));
    }
    
    private static String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        
        return sb.toString();
    } 
    
}
