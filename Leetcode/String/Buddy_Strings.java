package Leetcode.String;

import java.util.Scanner;

public class Buddy_Strings
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String s1=scanner.nextLine();
       System.out.println(buddyStrings(s1,s));
    }
    public static boolean buddyStrings(String A, String B) {
        if (A.equals(B)){
            int count=0;
            for (int i=0;i<A.length();i++){
                for (int j=0;j<B.length();j++){
                    if (A.charAt(i)==B.charAt(j) && i!=j){
                        count++;
                    }
                    if (count==1){
                        break;
                    }
                }
            }
        }else {

        }
        return true;
    }
}
