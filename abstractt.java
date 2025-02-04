abstract class Animal{
    public abstract void sound();
}
class dog extends Animal{
    public void sound(){
        System.out.println("BOW BOW.....!");
        System.out.println("Dog Name : MOZO");
        System.out.println("Dog breed : German Shephard");
        System.out.println("Dog price : 28,000");
        System.out.println("Dog age : 9.5");
        System.out.println("Dog Location : Krishna Nagar");
        System.out.println("Dog Gender : Male");
        System.out.println("Dog Owner : suraj mal gurjar");
    }
}
class cat extends Animal {
    public void sound() {
        System.out.println("MEOW MEOW.....!");
    }
}
public class abstractt {
    public static void main(String[] args) {
        dog obj = new dog();
        cat obj1 = new cat();
        obj.sound();
        obj1.sound();
    }
}
