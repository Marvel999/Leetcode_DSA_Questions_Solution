package Leetcode.String;

import java.util.Scanner;

public class String_palindrom_Two {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        int coun=0;
        StringBuilder sb=new StringBuilder(s);
        String s1=s.substring(0,(sb.length()/2)+1);
        String s2=s.substring((sb.length()/2)+1,sb.length());

        while (i<=j){

            if(s.charAt(i)==s.charAt(j)){
                j--;
                i++;

            }
            else {
                   if (isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j))
                       return true;
                   return false;

            }
        }
        return true;

    }

    public static boolean isPalindrome(String s1 ,int i,int j) {

        while (i<=j){
            if (s1.charAt(i)!=s1.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}



//
//    public static boolean validPalindrome(String s) {
//
//        int i=0;
//        int j=s.length()-1;
//        int coun=0;
//        StringBuilder sb=new StringBuilder(s);
//        String s1=s.substring(0,(sb.length()/2)+1);
//        String s2=s.substring((sb.length()/2)+1,sb.length());
////        System.out.println(s1);
////        System.out.println(s2);
//        while (i<=j){
//
//            if(s.length()<=3){
//                if (s.charAt(i)!=s.charAt(j) ) {
//                    return false;
//                }
//                i++;
//                j--;
//            }
//            else {
//                if (s.charAt(i)!=s.charAt(j) && coun==0){
////                System.out.println(s.charAt(i)+" "+s.charAt(j));
//                    coun++;
//                    j--;
//                }
//                else if (s.charAt(i)!=s.charAt(j) && coun>=1 ) {
//                    return false;
//                }
//                i++;
//                j--;
//
//            }
//        }
////        System.out.println(s1);
//        return true;
//    }