import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(a);
        n.add(b);
        n.add(c);
        Collections.sort(n);
        if(n.get(0) >= 0) {
            System.out.println(n.get(2) * n.get(1));
        }
        else {
            System.out.println(n.get(0) * n.get(1));
        }
    }
}
