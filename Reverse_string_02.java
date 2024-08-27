//  public package String_Builder;
 
 class Reverse_string_02 {
 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Helloworld");
        for(int  i = 0; i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char fontChar= sb.charAt(front);
            char  backChar= sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fontChar);
        }
        System.out.println(sb);
 }}