import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        int l = in.nextInt();
        in.close();
        int mid = l / 2;
        if (l % 2 != 0) {
            for (int i = 0; i < l; i++) {
                if (i == mid) {
                    System.out.print(c);
                } 
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        else {
            System.out.println("CAN'T");
        }
    }
}
