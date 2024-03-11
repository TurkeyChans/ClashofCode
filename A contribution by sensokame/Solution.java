import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int robotX = in.nextInt();
        int robotY = in.nextInt();
        int destX = in.nextInt();
        int destY = in.nextInt();
        System.out.println(Math.abs(robotX - destX) + Math.abs(robotY - destY));
    }
}