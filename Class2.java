public class Class2 {
    
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2("Labrador");
        System.out.println(dog1);
        
        dog1.setLegs(3); // My lab had a very bad injury :(
        System.out.println(dog1);
    }

}

class Dog2 {
    private int legs = 4;
    private String breed;

    public Dog2 (String breed) {
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


