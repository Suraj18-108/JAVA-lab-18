abstract class Flowers {
    String flower_name;
    String flower_color;
    String flower_price;
    String flower_size;
    String flower_fragrance;


    public abstract void flowers_name();
}
class Rose extends Flowers {
    public void flowers_name() {
        flower_name = "Rose";
        flower_color = "red";
        flower_price = "RS. 50";
        flower_size = "S";
        flower_fragrance = "Rosy";


        System.out.println("Flower_Details");
        System.out.println("=======");
        System.out.println("Flower Name is " + this.flower_name);
        System.out.println("Flower Color is " + this.flower_color);
        System.out.println("Flower Price is " + this.flower_price);
        System.out.println("Flower Size is " + this.flower_size);
        System.out.println("Flower Fragrance is " + this.flower_fragrance);
        }
}
public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.flowers_name();

    }
}