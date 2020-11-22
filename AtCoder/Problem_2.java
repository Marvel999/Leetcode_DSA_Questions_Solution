package AtCoder;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int out=0;

        if(num/100!=0 && num>=500){
        int num1=num%500;
        if (num1!=0){
        num=num-num1;
        out=((num1/5)*5);
        out=out+num*2;
        }else {

            out=out+num*2;
        }
        }
       else{
            int rem=(num/5);
            out=(rem*5);
       }
        System.out.println(out);
    }
}
