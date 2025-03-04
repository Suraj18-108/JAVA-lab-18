import java.util.HashSet;
import java.util.Set;

class Main{
    public static void main(String [] args){
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Chikoo");
        fruits.add("Watermelon");
        fruits.add("Apple");

        System.out.println("Fruits Details");
        System.out.println("======");
        System.out.println("FRUITS : "+fruits);

    }
}