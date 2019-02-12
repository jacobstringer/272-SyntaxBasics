public class ArrayInit {
    
    public static void main(String[] args) {
        // Set numbers at initialisation. Size defaults to fit the items given.
        int[] nums = new int[]{2,3,4,5,6,2,3,3}; 
        double[] decimals = new double[]{ // Splitting across lines within the block is valid Java code
            1.02,
            123.12,
            1e120, // 2^120
        };
        
        // Set size
        String[] stringSet = new String[7]; // Objects default to null
        stringSet[2] = "Yeah I'm that rebel that doesn't go in order";
        for (String str: stringSet) {
            System.out.println(str);
        }
        
        /* Prints:
        null
        null
        Yeah I'm that rebel that doesn't go in order
        null
        null
        null
        null
        */
    }
    
}