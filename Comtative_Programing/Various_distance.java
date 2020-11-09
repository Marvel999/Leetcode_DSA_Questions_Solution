package Comtative_Programing;

import java.util.Scanner;

public class Various_distance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        long[] arr=new long[size];
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        long manhatern=0;
        long euclid=0;
        long dhoby=0;
        for (long item:arr){
            manhatern=manhatern+Math.abs(item);
            euclid+=item*item;
            dhoby=Math.max(Math.abs(item),dhoby);
        }


        System.out.println(manhatern);
        System.out.println(String.format("%.15f", Math.sqrt((double) euclid)));
        System.out.println(dhoby);

    }

}
