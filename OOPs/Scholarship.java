package OOPs;

import java.util.Scanner;

class StringDistinct {
    private String s;

    public StringDistinct(String s) {
        this.s = s;
    }

    public int minChangesToMakeDistinct() {
        int[] freq = new int[26];
        int changes = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            if (freq[s.charAt(i) - 'a'] > 1) {
                changes++;
                freq[s.charAt(i) - 'a']--;
            }
        }
        return changes;
    }
}

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringDistinct stringDistinct = new StringDistinct(s);
            int changes = stringDistinct.minChangesToMakeDistinct();
            System.out.println(changes);
        }
        sc.close();
    }
}
