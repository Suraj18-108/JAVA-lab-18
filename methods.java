import java.util.Scanner;

public class methods {
    Scanner sc = new Scanner(System.in);
    float fun(){
        System.out.println("Enter a and b");
        float a =sc.nextFloat();
        float b =sc.nextFloat();
        return a+b;
    }
    public static void main(String[] args){
        methods m = new methods();
        float x = m.fun();
        float y = m.fun();
        float z = m.fun();
        System.out.println(x+y+z);
    }
}

