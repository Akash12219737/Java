// package String;
// package Styring;
// 
public class string_01 {
    public static void main(String[] args) {
        String name = "Akash";
        String samename = "Akash";
        String newname = new String ("Akash");
        System.out.println(name);
        System.out.println(samename);
        System.out.println(newname);

        if (name == samename){
            System.out.println("both are same");
        }


        // store at different place
        if (name == newname) {
            System.out.println("both are same");
        }else{
            System.out.println("not same");
        }


        // compare the value of the string it always give corect answer

        if (name.equals(newname)) {
            System.out.println("name and newname have same values");
        }else{
            System.out.println("not same");
        }


        String n1 = "Akash";
        String n2 = "akash";
        if(n1.equalsIgnoreCase(n2)){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
    }
}
