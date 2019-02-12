public class Class2 {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador");     
        System.out.println(dog1);
        
        dog1.setLegs(3); // My lab had a very bad injury :(
        System.out.println(dog1);
    }
    
}

class Dog {
    private int legs = 4;
    private String breed;
    
    public Dog (String breed) {
        this.breed = breed;
    }
    
    public void setLegs(int legs) {
        this.legs = legs;
    }
    
    public int getLegs() {
        return legs;
    }
    
    public String toString() {
        return String.format("This dog is a %s. It has %s legs.", this.breed, this.legs);
    }
}
