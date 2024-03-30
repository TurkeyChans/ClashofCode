import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        Boolean s = true;
        int H = 0;
        while(s) {
            if(M >= 60) {
                H++;
                M = M - 60;
            }
            else {
                s = false;
            }
        }
        System.out.println(H + "h " + M + "m");
    }
}