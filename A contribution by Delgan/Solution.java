import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean s = true;
        String ss = "";
        if(n != 1) {
        System.out.print(n + " ");
        
        do {
            if(n == 1) {
                s = false;
            }
            else if(n % 2 == 0) {
                n /= 2;
                ss += n + " ";
            }
            else {
                n = n * 3 + 1;
                ss += n + " ";
            }
        }
        while(s);
        System.out.print(ss.substring(0, ss.length()-1));
        }
    
    else {
        System.out.print(n);
    }
    }
}