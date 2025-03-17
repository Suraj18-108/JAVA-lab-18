class Child extends Thread {
    private String Name;
    private String habitat;
    private String price;
    private String age;
    private String ownername;

    // Constructor
    public Child(String Name, String habitat, String price, String age, String ownername) {
        this.Name = Name;
        this.habitat = habitat;
        this.price = price;
        this.age = age;
        this.ownername = ownername;
    }

    // Run method to display animal details
    public void run() {
        System.out.println("Animal Name: " + Name);
        System.out.println("Habitat: " + habitat);
        System.out.println("Price: " + price);
        System.out.println("Age: " + age);
        System.out.println("Owner Name: " + ownername);
        System.out.println();
    }
}

public class Main_Thread {
    public static void main(String[] args) {
        System.out.println("Animal Details:");
        System.out.println("---------------");

        // Creating instances of Child (threads) with animal details
        Child animal1 = new Child("Lion", "Savannah", "100000", "12", "Suraj");
        Child animal2 = new Child("Elephant", "Forest", "500000", "25", "Ashifa");
        Child animal3 = new Child("Penguin", "Antarctic", "30000", "8", "Shivam");
        Child animal4 = new Child("Donkey", "Nepal", "150000", "10", "Adarsh");
        Child animal5 = new Child("Squirrel", "Mumbai", "200000", "15", "Pradushan");

        // Starting threads individually
        animal1.run();
        animal2.run();
        animal3.run();
        animal4.run();
        animal5.run();
    }
}