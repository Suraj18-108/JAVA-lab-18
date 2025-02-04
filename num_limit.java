import java.util.Scanner;

public class num_limit {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = num.nextInt();
        if (n>=0 && n<=9) {
            System.out.println("1 digit");
        }
        else if (n>=10 && n<=99) {
            System.out.println("2 digit");
        }
        else if (n>=100 && n<=999) {
            System.out.println("3 digit");
        }
        else if (n>=1000 && n<=9999) {
            System.out.println("4 digit");
        }
        else {
            System.out.println("outa limit pal !!");
        }
    }
}
