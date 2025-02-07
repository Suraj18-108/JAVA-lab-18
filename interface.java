interface car{
    // public abstract void start(){// abstract method
    void start();

    void moving();
    void stopping();
    //interface method
}
class car7 implements car{
         //implement interface class
    public void start() {
        // normal method
        System.out.println("CAR MOVEMENT ");
        System.out.println("===========");
        System.out.println("car is starting.....!!");

    }
    public void moving(){
        System.out.println("car is moving.....!!");

    }
    public void stopping(){
        System.out.println("car is stopping.....!!");
    }
}
class Main{
    public static void  main(String[]args){
        car7 sr = new car7();
        car7 sr1 = new car7();
        car7 sr2 = new car7();
        sr.start();
        sr1.moving();
        sr2.stopping();
    }
}
