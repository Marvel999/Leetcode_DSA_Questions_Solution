package Leetcode.String;

import java.util.HashMap;
import java.util.Scanner;

public class Roman_to_Integer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       System.out.println(romanToInt(scanner.nextLine()));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int prev=0;
        int curr=0;
        int sum=0;
        for (int i=0;i<s.length();i++){

                if (i>=1){
                    curr=hm.get(s.toUpperCase().charAt(i));
                }else {
                    curr=0;
                }
                if (curr<=prev){
                    sum+=curr;
                    prev=hm.get(s.toUpperCase().charAt(i));
                }else {
                    sum-=curr;
                    prev=hm.get(s.toUpperCase().charAt(i));
                }

        }
        return sum;
    }
}
