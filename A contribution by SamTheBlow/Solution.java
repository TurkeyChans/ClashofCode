import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String faces = in.nextLine();
        int ans = 0;
        for(int i = 0; i < faces.length(); ++i) {
            if(faces.charAt(i) == ')') {
                ans++;
            }
            else if(faces.charAt(i) == '^') {
                ans++;
                i += 2;
            }
            else if(faces.charAt(i) == '>' || faces.charAt(i) == '(') {
                ans--;
            }
        }

        System.out.println(ans);
    }
}