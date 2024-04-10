// package Method in java Practice question;
//*********print table ********/

public class multiplaction_table {
    
    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Multiplication Table for " + number + ":");
        printMultiplicationTable(number, 1);
    }
}

    

