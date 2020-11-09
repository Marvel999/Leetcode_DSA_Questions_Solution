package String;

import java.util.Scanner;
import java.util.Stack;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(reverseOnlyLetters(s));

    }
    public static String reverseOnlyLetters(String S) {
     char[] ch=S.toCharArray();
        Stack<Character> letter=new Stack<>();
        for (char c:S.toCharArray()){
            if (Character.isLetter(c))
           letter.push(c);
        }
        StringBuilder ans=new StringBuilder();
        for (char c:S.toCharArray()){
             if (Character.isLetter(c)){
                 ans.append(letter.pop());
             }else {
                 ans.append(c);
             }
        }

        return ans.toString();
    }

}
