import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();

        for(int i = 0; i < S.length(); ++i) {
            if(Character.isUpperCase(S.charAt(i))) {
                System.out.print(S.charAt(i));
            }
        }
    }
}
