import java.util.Scanner;

public class trendy_num {
    public static void main(String[] args) {
        Scanner tre = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = tre.nextInt();
        int n = num/10;
        int n1 = num%10;
        if (n1 % 3 == 0 ) {
            System.out.println("it is a trendy number");
        }
        else {
            System.out.println("it is not a trendy number");
        }
    }
}
