import java.util.Scanner;

public class ghar {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x1 = d.nextInt();
        int y1 = d.nextInt();
        int x2 = d.nextInt();
        int y2 = d.nextInt();
        float x3 =(x1+x2)/2;
        float y3 =(y1+y2)/2;
        System.out.println("Arun's house located at "+x1+" "+y1);
        System.out.println("Ashok's house located at "+x2+" "+y2);
        System.out.println(x3+" "+y3);
    }
}
