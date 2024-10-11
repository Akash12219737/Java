import java.io.*;

public class TakingInput_BufferReader {
    public static void main(String[] args) throws IOException {
        int a , b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        a= Integer.parseInt(br.readLine()); // String convert to int
        
        System.out.println("Enter the secound number");
        b = Integer.parseInt(br.readLine());
        c= a+b;
        System.out.println("Sum of two numbers is "+ c);
    }
   
}