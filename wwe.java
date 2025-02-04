import java.util.Scanner;

public class wwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date ");
        int date = sc.nextInt();
        System.out.println("Enter month ");
        int month = sc.nextInt();
        System.out.println("Enter year  ");
        int year = sc.nextInt();
        System.out.println(" ");
        System.out.println(date+"/"+month+"/"+year);
        if (month == 01 || month == 1 ) {
            System.out.println(date+"/"+"January"+"/"+year);
        }
        if (month == 02 || month == 2) {
            System.out.println(date+"/"+"February"+"/"+year);
        }
        if (month == 03 || month == 3) {
            System.out.println(date+"/"+"March"+"/"+year);
        }
        if (month == 04 || month == 4) {
            System.out.println(date+"/"+"April"+"/"+year);
        }
        if (month == 05 || month == 5) {
            System.out.println(date+"/"+"May"+"/"+year);
        }
        if (month == 06 || month == 6) {
            System.out.println(date+"/"+"June"+"/"+year);
        }
        if (month == 07 || month == 7) {
            System.out.println(date+"/"+"July"+"/"+year);
        }
        if (month == 8 || month == 8) {
            System.out.println(date+"/"+"August"+"/"+year);
        }
        if (month == 9 || month == 9) {
            System.out.println(date+"/"+"September"+"/"+year);
        }
        if (month == 10) {
            System.out.println(date+"/"+"October"+"/"+year);
        }
        if (month == 11) {
            System.out.println(date+"/"+"November"+"/"+year);
        }
        if (month == 12) {
            System.out.println(date+"/"+"December"+"/"+year);
        }
    }
}
