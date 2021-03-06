public class Class1 {
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador");
        Dog dog2 = new Dog("Chihuahua");
        
        System.out.println(dog1);
        System.out.println(dog2);
    }
    
}

class Dog {
    private int legs = 4;
    private String breed;
    
    public Dog (String breed) {
        this.breed = breed;
    }
    
    public String toString() {
        return String.format("This dog is a %s. It has %s legs.", this.breed, this.legs);
    }
}
