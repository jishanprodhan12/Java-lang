
package com.mycompany.javamainclass;
import java.util.Scanner;
public class MultiplicationUsingFor {
    public static void main(String[] args) {
        int n,range,multi=1;
        System.out.println("Enter your range ");
        Scanner in=new Scanner(System.in);
        range =in.nextInt();
        System.out.println("Your range is "+range);
        for (int i = 0; i < range; i++) {
            System.out.println("Enter "+(i+1)+" number");
            Scanner obj=new Scanner(System.in);
            n=obj.nextInt();
            multi=multi*n;
            
    }
        System.out.println("multiplying your range "+multi);
    }
}
