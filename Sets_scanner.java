/*
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sets_scanner {
    public static void main(String[] args) {
        Set<String> politics = new HashSet<>();
        Scanner sr = new Scanner(System.in);
        while(true){
            System.out.print("Enter : (done to finish) ");
            String a = sr.nextLine();
            if(a.equalsIgnoreCase("done")){
                break;
            }
            politics.add(a);
        }
        System.out.println(politics);
        for (String i : politics){
            System.out.println(i);
        }
    }
}
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sets_scanner {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        Scanner sr = new Scanner(System.in);

        while(true){
            System.out.print("Enter : (done to finish) ");
            int a = sr.nextInt();
            if(a == 0){
                break;
            }
            number.add(a);
        }
        System.out.println(number);
        for (int i : number) {
            System.out.println(i);
        }
    }
}