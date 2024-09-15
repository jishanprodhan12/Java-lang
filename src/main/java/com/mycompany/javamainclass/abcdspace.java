package com.mycompany.javamainclass;
import java.util.Scanner;

public class abcdspace {
    
        public static void main(String[] args){
        System.out.println("enter any number ");
        Scanner in=new Scanner(System.in);
        int i,j,n;
        n=in.nextInt();

    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
            System.out.printf("%c ",j+64);
                }
                else {
                    System.out.print("  ");
                }
        }
        System.out.println("\n");
    }
    }
}

