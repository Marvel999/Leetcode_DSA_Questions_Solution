package AtCoder;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
           int j=n-i;
           if(i*i<n)
               count++;
            if(i*j<n)
               count++;

        }
        System.out.println(count);

    }
}
