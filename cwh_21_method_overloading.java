public class cwh_21_method_overloading {
        static void foo(){
            System.out.println("good morning bro!");
        }
        static void foo(int a, int b){  //a and b are parameter 
            System.out.println("Good morning "+ a+" bro!");
            System.out.println("Good morning "+ b+" bro!");
        }
        
    public static void main(String[] args) {

        foo();
        foo(300, 400);  //300 and 400 both are argument 
    }
}
