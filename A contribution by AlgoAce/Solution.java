import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s = 0;
        int p = 1;
        int temp = N;
        while (temp > 0) {
            int num = temp % 10;
            s += num;
            p *= num;
            temp /= 10;
        }
        System.out.println(p - s);
    }
}