import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String DNA = in.nextLine();
        
        for(int i = 0; i < DNA.length(); ++i) {
            if(DNA.charAt(i) == 'A') {
                System.out.print("AA");
            }
            if(DNA.charAt(i) == 'T') {
                System.out.print("TTT");
            }
            if(DNA.charAt(i) == 'C') {
                System.out.print("C");
            }
        }
    }
}