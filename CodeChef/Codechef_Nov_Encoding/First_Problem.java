package CodeChef.Codechef_Nov_Encoding;

import java.util.Scanner;

public class First_Problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=0;
        if(scanner.hasNextInt())
         test=scanner.nextInt();
        while (test-->0){
            int H=0,X=0;
            if(scanner.hasNextInt())
             H=scanner.nextInt();
            if(scanner.hasNextInt())
             X=scanner.nextInt();

            if(H>=X)
                System.out.println("Yes");

            else
                System.out.println("No");
        }
    }
}
