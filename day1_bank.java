import java.util.*;
class Solution {
    public int totalMoney(int n) {
        int day;
        int mon=1;
        int total=0;

        while (0<n){
            for(day=0; day < Math.min(n,7); day++){
                total += mon + day;
            }
            n-=7;
            mon++;
        }
        return total;
    }
}

public class day1_bank{
    public static void main(String args[]){
        Solution sol = new Solution();
        System.out.println(sol.totalMoney(10));
    }
}