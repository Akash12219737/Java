// package Method;

public class Learn_01 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        greet();
        System.out.println("8");
        average(4, 10);
        System.out.println("77");
        int result = avg1(1, 10, false);
        int double_avg1 = result * 5;
        System.out.println(double_avg1);
    }

    static void greet() {
        System.out.println("5");
        System.out.println("hello akash");
        System.out.println("6");
    }

    public static void average(int a, int b) {
        int avg = (a + b) / 2;
        // You can add a print statement here if needed
        // System.out.println("Average is: " + avg);
    }

    static int avg1(int a, int b, boolean shouldAvg1) {
        if (!shouldAvg1) {
            return -1;
        }
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
