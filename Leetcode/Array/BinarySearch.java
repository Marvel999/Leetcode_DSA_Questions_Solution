package Leetcode.Array;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] ar, int key) {
        int l=0;
        int h=ar.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]>key){
                h=mid-1;
            }
            else if(ar[mid]<key){
                l=mid+1;
            }else{
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int key = s.nextInt();
        System.out.println(search(ar, key));
    }
}
