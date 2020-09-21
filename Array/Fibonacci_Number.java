package Array;
//https://leetcode.com/problems/fibonacci-number
public class Fibonacci_Number {
    public int fib(int N) {
        if(N==0)
            return 0;
        else if(N==1)
            return 1;
        else
        {
            int a=0;
            int b=1;
            int sum=0;
            for(int i=2;i<=N;i++){
                sum=a+b;
                a=b;
                b=sum;
            }

            return sum;
        }

    }
}
