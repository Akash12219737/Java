// Remove all the occurence of "a" from string s ="abcax"

public class Remove_a_from_string_18 {
    // Not give index vlaue
    static String removeoccurr(String s){
        if(s.length()==0) return "";
        String smallAns = removeoccurr(s.substring(1));
        char currChar = s.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        }else{
            return smallAns;
        }
    }





    //  Given using index value 
 static String removeoccurrence(String s, int idx){
    if(idx == s.length()) return "";
    String smallAns = removeoccurrence(s, idx+1);
    char currChar = s.charAt(idx);
    if(currChar != 'a'){
        return currChar + smallAns;
    }else{
        return smallAns;
    }

 }
    public static void main(String[] args) {
        String s = "abcdagh";
        System.out.println(removeoccurrence(s,0));
        System.out.println(removeoccurr(s));
    }
}
