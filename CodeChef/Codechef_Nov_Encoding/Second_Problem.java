package CodeChef.Codechef_Nov_Encoding;

import java.util.Scanner;

public class Second_Problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=0;
        if(scanner.hasNextInt())
            test=scanner.nextInt();
        while (test-->0){
            int size=0;
            if (scanner.hasNextInt())
             size=scanner.nextInt();
            int[] arr=new int[size];
            for (int i=0;i<size;i++){
                arr[i]=scanner.nextInt();
            }
            int i, j, temp;
            int out=0;
            boolean swapped;
            for (i = 0; i < size - 1; i++)
            {
                swapped = false;
                for (j = 0; j < size - i - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                      out++;
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (swapped == false)
                    break;
            }

            for (int iteam:arr){
                System.out.println(iteam);
            }
            System.out.println(out);

        }
    }
}
