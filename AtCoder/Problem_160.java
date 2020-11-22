package AtCoder;

import java.util.Scanner;

public class Problem_160 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.length()>=6){
          if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5))
              System.out.println("Yes");
          else
              System.out.println("No");
        }else
            System.out.println("No");
    }
}
