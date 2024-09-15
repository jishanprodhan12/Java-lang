
package com.mycompany.javamainclass;
import java.util.Scanner;

public class swackiPattern {
    public static void main(String[] args) {
        int num,mid,i,j;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter any number ");
        num=in.nextInt();
        mid = num/2+1;
        for ( i = 1; i <=num; i++) {
            for ( j = 1; j <= num; j++) {
                 if((i==mid || j==mid)||(i==1 && j<=mid)
                    ||(i==num && j>=mid )||(j==1 && i>=mid && i<=num)
                    ||(j==num && i<=mid ))
 {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
   
            }
            System.out.print("\n");
        }
    }
    
}
