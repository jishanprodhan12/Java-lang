
package com.mycompany.javamainclass;

import java.util.Scanner;
public class peramidPattern {
    public static void main(String[] args) {
        int i,j,s,n;
        System.out.println("enter the number of row's ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("\n");
        for(i=1;i<=n;i++){
        for(s=n;s>=i;s--)
            System.out.print(" ");
        for(j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }  
  }
}
