public class questions {
    public static void main(String[] args) {
       //Q 1. Write a program to find sum of three numbers
        int firstNum = 12;
        int secondNum = 13;
        int thirdNum = 14;
        int calculatedNum = firstNum + secondNum + thirdNum;
        System.out.println(calculatedNum+" is sum of "+firstNum+" and "+secondNum +" and "+thirdNum);

        //Q 2. Write a program to find avg using marks of three numbers
        int a = 12;
        int b = 18;
        int c = 24;
        int sum = a + b + c;
        int average = sum/3;
        System.out.println("Average of "+a+ " and "+b+" and "+c+" is " + average);

        //Q 3. Write a program to take two numbers and perform addition, subtraction
        // multiplication and division . 14 and 4
        int x = 14;
        int y = 4;
        int add = x + y;
        int subtract = x - y;
        int multiply = x * y;
        int divide = x / y;
        System.out.println("The sum of "+x+" and "+y+" is "+add);
        System.out.println("The difference of "+x+" and "+y+" is "+subtract);
        System.out.println("The product of "+x+" and "+y+" is "+multiply);
        System.out.println("The division of "+x+" and "+y+" is "+divide);


    }
}
