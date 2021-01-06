package codeForce;

import java.util.Scanner;

public class RobotProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        while (test-->0){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int xi=0;
            int yi=0;
            int out=0;
            boolean east=true,west=true,north=true,south=true;
            while (xi!=x && yi!=y){
                  if(north && yi+1<=y){
                    yi++;
                      out++;
                    east=true;
                    west=true;
                    north=false;
                    south=true;

                    System.out.print("N");
                }
                else if(east && xi+1<=x){
                  xi++;
                  out++;
                  east=false;
                  west=true;
                  north=true;
                  south=true;
                  System.out.print("E");
                }

                else if(south && yi-1>=0){
                      yi--;
                      out++;
                    east=true;
                    west=true;
                    north=true;
                    south=false;

                    System.out.print("S");
                }

                  else if(west && xi-1>=0){
                      xi--;
                      out++;
                      east=true;
                      west=false;
                      north=true;
                      south=true;
                      System.out.print("W");
                  }
            }
            System.out.println();
            System.out.println(out);
        }
    }
}
