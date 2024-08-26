// package String_Builder;

public class String_01 {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 
       sb.setCharAt(0, 'p');
       System.out.println(sb);
 

       sb.insert(2, 'n');
       System.out.println(sb);

    //    delete the extra 'n'
       sb.delete(2, 4);  // ending index is not inclusive
       System.out.println(sb);

    //    add in last
    sb.append("Stark");
    System.out.println(sb);
    System.out.println(sb.length());
    }
}
