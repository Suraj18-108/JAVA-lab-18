import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Arithmetic operator
        int a = 20 , b = 40 ;
        int c = 10,d=15;
        boolean e = true;
        /*
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);*/

        //Comparison operators
        /*
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        */

        //Assignment operators
        /*
        c+=20;
        d+=c;
        System.out.println(c);
        System.out.println("+");
        System.out.println(d);
        System.out.println("=");
        System.out.println(c+d);
        */

        //Logical operators
        /*
        System.out.println(a == 20 && b == 40 );
        System.out.println(a == 20 && b == 45);
        System.out.println(a == 20 || b == 45);
        System.out.println(!e);
        */

        // Unary operator

        System.out.println(a++);
        System.out.println("a = "+a);
        System.out.println(++a);
        System.out.println("a = "+a);
        System.out.println(a--);
        System.out.println("a = "+a);
        System.out.println(--a);
        
    }
}
