import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int M = in.nextInt();
            num.add(M);
        }
        Collections.sort(num);
        for (int j = N - 1; j >= 0; j--) {
            int a = num.get(j);
            boolean p = true;
            if (a <= 1) {
                p = false;
            } 
            else if (a == 2) {
                p = true;
            } 
            else if (a % 2 == 0) {
                p = false;
            } 
            else {
                for (int k = 3; k <= Math.sqrt(a); k += 2) {
                    if (a % k == 0) {
                        p = false;
                        break;
                    }
                }
            }
            if (p) {
                System.out.println(a);
                return;
            }
        }
    }
}
