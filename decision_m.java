import java.util.*;
import java.io.*;
public class decision_m {
    public static void main(String[] args) {
        Scanner dec = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = dec.nextInt();
        if (n>=100 && n<=999){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
    }
}
