import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,area, perimeter;
        System.out.println("Enter length");
        a = sc.nextInt();
        System.out.println("Enter Breadth");
        b = sc.nextInt();
        perimeter = (a+b)*2;
        area = a*b;
        System.out.println("Area is "+area+"sqm");
        System.out.println("Perimeter is "+perimeter+"sqm");


    }
}
