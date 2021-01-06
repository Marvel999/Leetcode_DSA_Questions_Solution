package Leetcode.String;

import java.util.Scanner;

public class Maximum_Repeating_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sec=sc.next();
        String word=sc.next();
        System.out.println(maxRepeating(sec,word));
    }

    public static int maxRepeating(String sequence, String word) {
        int sm=0;
        int count =0;
        int n=sequence.length();
        int m=word.length();

        for ( int i=0; i+m-1< n ;)
        {
            String substr = sequence.substring(i,i+m);
            if(substr.equals(word))
            {
                sm++;
                i+=m;
                count = Math.max(count,sm);
            }else{
                sm=0;
                i++;
            }
        }
        return(count);
    }

}
