package AtCoder;

import java.util.Scanner;

public class B_Quizzes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int intial=scanner.nextInt();
        String str=scanner.next();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='o')
                intial++;
            else if(intial>0)
                intial--;
        }
        System.out.println(intial);
    }
}
