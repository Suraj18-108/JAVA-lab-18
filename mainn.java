import java.io.*;
class teacher{
    int id;
    String name;
}
class student{
    int id = 10;
    String name = "Muthu";
    void fun(){
        System.out.print("\nTrainer");
    }
}
class mainn
{
    public static void main(String[] args) {
        teacher tamil = new teacher();
        tamil.id = 101 ;
        tamil.name = "Muthu ";
        System.out.println(tamil.id+" "+tamil.name);
        student stud = new student();
        stud.id = 102 ;
        stud.name = "Suraj";
        System.out.print(stud.id+" "+stud.name);
    }
}

