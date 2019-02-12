public class For4 {
    
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            if (!(i < 10)) {
                break;
            }
            System.out.printf("Iteration number %d%n", i);
            i++; // Same as i += 1
        }
    }
    
}
