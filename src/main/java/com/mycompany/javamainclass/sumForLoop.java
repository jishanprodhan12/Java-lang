
package com.mycompany.javamainclass;

import java.util.Scanner;

public class sumForLoop {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your range");
        int range,sum=0,n;
        range =in.nextInt();
        System.out.println("Your range is "+range);
        for (int i = 0; i <range; i++) {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter "+(i+1)+" number ");
            n = obj.nextInt();
            sum+=n;
            
        }
        System.out.println("Sum of your range "+sum);
    }
}
