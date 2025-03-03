import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[]args){
        List <String> list = new ArrayList<>();//creating list
        list.add("Apple");
        list.add("banana");
        list.add("Mango");
        list.add("Kiwi");
        list.add("Papaya");
        list.add("Pomegranate");
        list.add("Grapes");
        list.add("Musk Melon");

        System.out.println("fruits:"+list);

        String get_fruit = list.get(4-1);
        System.out.println("=="+get_fruit+"==");

        list.remove("Apple");
        System.out.println(list);

        for (String i : list){
            System.out.println(i);

        }
    }
}