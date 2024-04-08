public class Variable_Arguments_33 {
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 4 is: " + sum(2, 5));
        System.out.println("The sum of 2, 3, and 4 is: " + sum(2, 5, 3));
        System.out.println("The sum of 2, 3, 6 and 4 is: " + sum(2, 3, 6 ,4));
    }
}
