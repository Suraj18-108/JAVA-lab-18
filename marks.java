import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int id,m1,m2;
        String s1 ,s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        s1=sc.nextLine();
        System.out.println("Enter Last Name");
        s2=sc.nextLine();
        System.out.println("Enter Id");
        id=sc.nextInt();
        System.out.println("Enter Mark1");
        m1=sc.nextInt();
        System.out.println("Enter Mark2");
        m2=sc.nextInt();

        System.out.println("Student Name is "+s1+" "+s2);
        System.out.println("Student Id is "+id);
        int average =(m1+m2)/2;
        System.out.println("Average is "+average);

    }
}
