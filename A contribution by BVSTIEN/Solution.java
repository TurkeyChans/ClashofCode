import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            if(!(n % 2 == 0)) {
                System.out.println("[x] " + n);
            }
            else {
                System.out.println("[ ] " + n);
            }
        }
    }
}