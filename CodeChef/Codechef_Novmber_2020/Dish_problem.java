package CodeChef.Codechef_Novmber_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Dish_problem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test=0;
        if(input.hasNextInt())
            test=input.nextInt();
        while(test-->0) {
            int size = 0;
            if (input.hasNextInt())
                size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                    arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int rem=0;

            if(size==1){
                System.out.println(arr[0]);
            }else {
            int a=arr[size-1];
            int b=0;
            for (int i=size-2;i>=0;i--){
                b=arr[i];
                if(i==0){
                    rem=rem+Math.max(a,b);
                }else {
                    rem=rem+Math.min(a,b);

                    a=Math.abs(a-b);
                }
            }
            System.out.println(rem);
            }




        }


    }
    }

