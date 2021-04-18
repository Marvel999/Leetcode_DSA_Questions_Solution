package CodeChef.CodeChef_Nov_Cookoff;

import java.util.Scanner;

public class First_Question {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = 0,m=0,k=0,q=0;
        int out=0;
        if(scanner.hasNextInt())
            n=scanner.nextInt();
        if(scanner.hasNextInt())
         m=scanner.nextInt();
        if(scanner.hasNextInt())
        k=scanner.nextInt();
        while (n-->0){
            int[] arr=new int[k];
            int sum=0;
            for (int i=0;i<k;i++){
                if(scanner.hasNextInt())
                    sum=sum+scanner.nextInt();

            }
            if(scanner.hasNextInt())
                q=scanner.nextInt();

            if(sum>=m && q<=10){
                out++;
            }
        }
        System.out.println(out);
    }
}
