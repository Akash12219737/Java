// Write a program to read a weekday number and print weekday name using switch statement

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println(" Monday");
                break;
                
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thrusday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
			System.out.println("Invalid...Please Enter the 0 to 6...");
			break;
        }
    }
}
// Write a program to read gender(M/F) and print the corresponding gender using a switch statement

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender");
        int n = sc.nextInt();
        switch(n){
            case 1:
            System.out.println("Male");
            break;
            case 2:
                System.out.println("Female");
                break;
            default:
            System.out.println("Enter valid input...");
            break;
        }
    }
}
//  Write a program to Check whether a character is a vowel or consonant using switch statement
import java.util.Scanner;
public class Main{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
            switch(ch){
              case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
                    System.out.println("Character is vowel");
                    break;
                default:
                System.out.println("Character is consonant");
                break;
                    
            }
        }
        
    }
}
// Write a program to Find the number of days in a month using a switch statement
import java.util.Scanner;
public class Main{
    public static void  main(String args[]){
       Scanner sc =new Scanner (System.in);
       System.out.println("Enter the number");
       int num = sc.nextInt();
       switch(num){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8 :
           case 10 :
           case 12 :
               System.out.println("In a month day is 31 days");
               break;
            case 2:
                System.out.println("In a month day is 28/29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("In a month day is 30 days");
                break;
            default:
            System.out.println("Enter the valid input");
       }
    }
}

// Write a program to create simple calculator using switch Statement
import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char op;
		Double n1, n2, res;
 
		System.out.println("+, -, *, or /");
		System.out.print("Choose an Operator :");
		op = input.next().charAt(0);
 
		System.out.print("Enter the Number 1 :");
		n1 = input.nextDouble();
		System.out.print("Enter the Number 2 :");
		n2 = input.nextDouble();
 
		switch(op)
		{
			case '+':
				res = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + res);
				break;
			case '-':
				res = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + res);
				break;
			case '*':
				res = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + res);
				break;
			case '/':
				res = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + res);
				break;
			default:
				System.out.println("Invalid Operator !");
				break;
		}
	}
}
//  Write a program to find the Maximum of Two Numbers using switch statement
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the first number");
       int n = sc.nextInt();
       System.out.println("Enter the secound Number");
       int m = sc.nextInt();
    //   switch(n > m ? 1 : (n<m? -1:0 ){
       switch(n > m ? 1 : (n<m? -1:0 )) {
           case 0: 
               System.out.println("Both number are Same");
               
               break;
        case -1:
            System.out.println("N is greater");
            break;
        case  1 :
           System.out.println("M is greater");
            break;
       }
       }
}
// Alternate
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the first number");
       int n = sc.nextInt();
       System.out.println("Enter the secound Number");
       int m = sc.nextInt();
        int result = Integer.compare(n , m);
            switch(result){
                case 1:
                    System.out.println("N is greater");
                    break;
                case -1:
                System.out.println("M is greater");
                break;
                case 0:
                    System.out.println("Both are equal");
                    break;
            }
       }
}
