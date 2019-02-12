public class ForEach {
    
    public static void main(String[] args) {
        String[] options = new String[]{
            "I like arrays, like this one!",
            "The [] syntax of arrays really excites me!",
            "ArrayLists are like Python lists",
            "Arrays are NOT like Python lists"
        };
        
        for (String option: options) { // Python equivalent 'for option in options:'
            System.out.println(option);
        }
    }
    
}
