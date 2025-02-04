class new {
    // Class attribute
    private static final String species = "Canis familiaris";

    // Instance attributes
    private String name;
    private int age;

    // Constructor method
    public new(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    public String bark() {
        return this.name + " says woof!";
    }

    // Class method
    public static String commonSpecies() {
        return "All dogs are of species: " + species;
    }

    // Static method
    public static boolean isDomestic() {
        return true;
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class neww {
    public static void main(String[] args) {
        // Creating objects
        new dog1 = new new("Buddy", 3);
        new dog2 = new new("Molly", 5);

        // Calling instance method
        System.out.println(dog1.bark());  // Output: Buddy says woof!

        // Calling class method
        System.out.println(neww.commonSpecies());  // Output: All dogs are of species: Canis familiaris

        // Calling static method
        System.out.println(neww.isDomestic());  // Output: True
    }
}

