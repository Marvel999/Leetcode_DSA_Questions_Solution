package AtCoder;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        int b=0;

        for(int i=1;i<n;i++){
            b=(n-1)/i;
            count+=b;


        }
        System.out.println(count);

    }
}
