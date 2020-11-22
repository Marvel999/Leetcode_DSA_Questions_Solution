package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int num =scanner.nextInt();

              if(num==1)
                  System.out.println("0");
              else if(num==2)
                  System.out.println("1");
              else if(num==3)
                  System.out.println("2");
              else if(num%2==0)
                  System.out.println("2");
              else
                  System.out.println("3");



        }
    }
}
