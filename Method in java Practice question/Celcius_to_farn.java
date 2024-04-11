public class Celcius_to_farn {
    static int celcius(int n){
        // float f;
    
     int c = (int)((n-32)*(5.0/9));
        return c;
    }
    public static void main(String[] args) {
       int result= celcius(5);
       System.out.println(result);
    }   
}

// public class Celcius_to_farn {
//     static int celsius(int fahrenheit){
//         int celsius = (int) ((fahrenheit - 32) * 5.0 / 9); // Correct calculation to convert Fahrenheit to Celsius
//         return celsius; // Return the Celsius value
//     }

//     public static void main(String[] args) {
//        int result = celsius(5); // Convert 5 degrees Fahrenheit to Celsius
//        System.out.println(result); // Print the result
//     }
// }

