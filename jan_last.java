
class Car{

    public void type1(){
        System.out.println("Car Type : Luxury");
    }
}
class Car1 extends Car{
    @Override
    public void type1(){
        System.out.println("Car Company : Mercedes-Benz");
        System.out.println("Car Model : Mercedes-Benz G-Wagon");
        System.out.println("Car Year : 2005");
        System.out.println("Car Price : RS. 2.44 CR");

    }
}

class Bike extends Car {
    @Override

    public void type1(){
        System.out.println("bike Company : BAJAJ");
        System.out.println("bike Model : Pulsar");
        System.out.println("bike Year : 2016");
        System.out.println("bike Price : Rs.85000");

    }
}
class bikee extends Bike {
    @Override
    public void type1(){
        System.out.println("bike Company : BAJAJ");
        System.out.println("bike Model : Avenger");
        System.out.println("bike Year : 2018");
        System.out.println("bike Price : Rs.200000");

    }
}
class Bikeee extends Car {
    public void type1(){
        System.out.println("bike Company : BAJAJ");
        System.out.println("bike Model : 220F");
        System.out.println("bike Year : 2015");
        System.out.println("bike Price : Rs.125000");
    }
}
public class jan_last {
    public static void main(String[] args) {
        System.out.println("BIKE DETAILS");
        System.out.println("=========");


        Car car = new Car();
        Car1 car1 = new Car1();
        Bike bike = new Bike();
        bikee bikee = new bikee();
        bikee.type1();
        car.type1();
        System.out.println("=========");

    }
}