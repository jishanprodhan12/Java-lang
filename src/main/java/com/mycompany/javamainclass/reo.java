
package com.mycompany.javamainclass;

import java.util.Scanner;


public class reo {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int n;
        System.out.println("enter your number :");
        n=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n"+n ,i +n*i);
            
        }
    }
}
