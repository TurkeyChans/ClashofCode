import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();  
        for (int i = 0; i < N; i++) {
            int T = in.nextInt();
            int C = in.nextInt();
            if((T <= 0 || C <= 0) || C > 14 || T > 101) {
                System.out.println("GLaDOS you filthy liar!");
            }
            else {
                System.out.println("That's a cake!");
            }
        }
    }
}