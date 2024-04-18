import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long ans = 0;
        for(int i = N; i >= 1; --i) {
            ans += N*i;
        }

        System.out.println(ans);
    }
}