import java.util.Scanner;

public class dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1,c1,d2,c2,dosum,centsum,addtodoll,addtocent;
        System.out.println("Enter dollar 1");
        d1 = sc.nextInt();
        System.out.println("Enter cent 1");
        c1 = sc.nextInt();
        System.out.println("Enter dollar 2");
        d2 = sc.nextInt();
        System.out.println("Enter cent 2");
        c2 = sc.nextInt();
        centsum = c1 + c2;
        dosum = d1 + d2;
        addtodoll =centsum/100;
        addtocent = dosum%100;
        System.out.println("Total dollars");
        System.out.println(dosum+addtodoll);
        System.out.println("Total cent");
        System.out.println((centsum -(addtodoll*100)));





    }
}
