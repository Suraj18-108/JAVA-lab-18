/* Polymorphism */

class Vehicles {
    public void bike_details(){
        System.out.println("Bike Details");

    }
}
class Bike1 extends Vehicles{
    @Override
    public void bike_details(){
        System.out.println("Bike Details");
        System.out.println("=========");
        System.out.println("Bike : Royal Enfield ");
        System.out.println("Model : Classic 350");

    }
}
class Bike2 extends Vehicles {
    @Override
    public void bike_details() {
        System.out.println("Bike Details");
        System.out.println("=========");
        System.out.println("Bike : Bajaj ");
        System.out.println("Model : Pulsar 220f");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Method overlaoding");
        System.out.println("==========");
        Bike1 b1 = new Bike1();
        Bike2 b2 = new Bike2();
        b1.bike_details();
        b2.bike_details();
    }
}