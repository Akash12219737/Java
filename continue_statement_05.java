public class continue_statement_05 {
    public static void main(String[] args){
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if (i==2) {
        //         System.out.println("Ending the loop");
        //         break;
                
        //     }
        //     i++;
        // } while (i<5);

        for(int i=0;i<20; i++){
            if(i==2){
                System.out.println("Endinf the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}
