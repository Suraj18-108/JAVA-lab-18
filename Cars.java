/*
class Vehicle{
    public static void Vehicle_type(){
        System.out.println("Vehicle type");
    }
}
class Car extends Vehicle{
    public static void car_type(){
        System.out.println("Mercedes Car");
        System.out.println("Model : G Wagon");
    }
}
class car1 extends Vehicle{
    public static void car1_type(){
        System.out.println("Volkswagen Car");
        System.out.println("Model : West fall camper");
    }

}
class car2 extends Vehicle{
    public static void car2_type(){
        System.out.println("Rolls Royce Car");
        System.out.println("Model : Sab ka baap");
    }
}
public class Cars {
    public static void main(String[] args) {

     Car obj = new Car();
     car1 obj1 = new car1();
     car2 obj2 = new car2();
        obj.Vehicle_type();

        System.out.println("Car Details");
        System.out.println("=======");

     obj.Vehicle_type();
     obj.car_type();

     System.out.println("======");

        obj.Vehicle_type();
        obj1.car1_type();
     System.out.println("======");

        obj.Vehicle_type();
        obj2.car2_type();
    }
}



class fruits{
    public static void fruit(){
        System.out.println("Fruit name : Mango");
        System.out.println("Fruit type : Alphonso");
        System.out.println("Fruit Color : Vibrant orange-yellow");


    }
}
class fruit_prop extends fruits{
    public static void fruit_prop(){
        System.out.println("Fruit Shape : round/oval/heart/kidney shaped");
        System.out.println("Fruit taste : Sweet and fruity");
        System.out.println("Fruit Price : Rs. 99/Pcs ");
    }
}
public class Cars {
    public static void main(String[] args) {
        System.out.println("Fruit details");
        System.out.println("==========");
        fruit_prop obj=  new fruit_prop();
        obj.fruit();
        obj.fruit_prop();

    }
}
*/
class parents{
    parents() {
        System.out.println("Parents  class Constructor");
    }
        void parent2(){
        System.out.println("Parents class method");
    }
}
class childs extends parents {
    childs(){
        super();
        super.parent2();
        System.out.println("Childs class Constructor");
    }
    void child2(){

        System.out.println("Childs class method");
    }
}
public class Cars {
    public static void main(String[] args) {
        childs obj = new childs();
        obj.child2();
    }
}
