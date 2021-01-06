package Leetcode.String;

import java.util.HashSet;
import java.util.Scanner;

public class Unique_Email_Addresses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] mail={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
       System.out.println( numUniqueEmails(mail));

    }

    public static int numUniqueEmails(String[] emails) {
        String base="";
        boolean b=true;
        HashSet<String> hs=new HashSet<>();
        for (int i=0;i<emails.length;i++){
            int j=0;
            base="";
            for (j=0;j<emails[i].length();j++){
            if (emails[i].charAt(i)=='@' && emails[i].charAt(i)=='+'){

                if (emails[i].charAt(i)=='+'){
                    b=false;
                }else {
                    break;
                }

            }
            else{
                if (b && emails[i].charAt(i)!='.' )
                base=base+emails[i].charAt(j);
            }

            }
            base=base+emails[i].substring(j,emails[i].length());
            hs.add(base);
            }
         System.out.println(hs);
        return hs.size();


        }


}
