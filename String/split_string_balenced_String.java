package String;

import java.util.Scanner;

public class split_string_balenced_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
       System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count=0;
        char first=s.charAt(0);
        int number=0;
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
//          System.out.println(count);

           if(count==0){
               number++;
           }
          if(ch==first){
              count++;
          }else {
             count--;
          }

      }
      return number;
    }

}
