import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner eo = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = eo.nextInt();
        if ( n == 0) {
            System.out.println("The number is zero");
        }
        else if (n % 2 == 0) {
            System.out.println("The number is even");
        }
        else if (n % 2 == 1) {
            System.out.println("The number is odd");
        }
        else {
            System.out.println("no pal !");
        }
    }
}
