public class Mainn {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println("========");
        Mainn obj = new Mainn();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 2.2));
        System.out.println(obj.add(100, 300));

    }
}