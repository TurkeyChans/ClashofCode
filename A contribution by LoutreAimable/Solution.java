import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        float cr = (float) (Math.round(c * 100.00) / 100.00);
        System.out.printf("%.2f\n", cr);
    }
}