import java.util.Scanner;

public class month_num {
    public static void main(String[] args) {
        Scanner mo = new Scanner(System.in);
        System.out.println("Enter the number of month: ");
        int month = mo.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days month");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11 || month == 12) {
            System.out.println("30 days month");
        }
        else if (month == 2){
            System.out.println("28 or 29 days month");
        }
        else {
            System.out.println("Not a valid month");
        }


    }
}
