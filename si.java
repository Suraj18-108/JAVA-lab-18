import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si,p,t,r,ta;
        System.out.println("Enter Principle Amount");
        p = sc.nextInt();
        System.out.println("Enter No. of Years");
        t = sc.nextInt();
        System.out.println("Enter Rate of Interest");
        r = sc.nextInt();
        si = (p*t*r)/100;
        System.out.println("Total Interest : "+si+"Rs");
        ta=si+p;
        System.out.println("Total Amount : "+ta+"Rs");


    }
}
