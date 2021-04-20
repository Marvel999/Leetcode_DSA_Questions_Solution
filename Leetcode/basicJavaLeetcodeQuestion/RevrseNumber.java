package Leetcode.basicJavaLeetcodeQuestion;
//https://leetcode.com/problems/reverse-integer/
//We can use try catch exception too.
public class RevrseNumber {
    public static int reverse(int x) {
        long ans=0;
        long n=x;
        while(n!=0){

            long rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        //Check number is in integer range or not.
        if(ans>=Integer.MIN_VALUE  && ans<=Integer.MAX_VALUE)
            return (int)ans;
        else
            return 0;
    }
}
