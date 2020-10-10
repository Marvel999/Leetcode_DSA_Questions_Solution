package Comtative_Programing;

import java.util.Scanner;

public class Leep_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int year=sc.nextInt();
            if(year%4==0){
                System.out.println("February 29");
            }
            else{
                System.out.println("March 1");
            }
        }
    }
}
