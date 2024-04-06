public class cwh_2_method_overloding{
static void telljoke(){
    System.out.println("I invented new world");
}
    static void change1(int a){
        a= 98;
    }
    static void change2(int [] marks2){
         marks2 [0] = 56;
    }

    public static void main(String[] args) {
       telljoke();
       int [] marks = {12,26,656,654};
    //    case: 1  change1
       int x= 45;
       change1(x);
       System.out.println("the value of x after running changes is: "+x);

    //    case: 2 change2
    int [] marks2= {12,655,98,65};
    change2(marks2);
    System.out.println("The change by reference :"+marks2[0]);
    }
}


