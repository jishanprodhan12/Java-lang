
package com.mycompany.javamainclass;

import java.util.Scanner;

public class arnstrongNumber {
    public static void main(String[] args) {
        int num,arm = 0,rem;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any three digit's base number ");
        num=in.nextInt();
        int orginal=num;
        System.out.println("your number is "+num);
        while (num!=0) {
            rem=num%10;
            arm+=(rem*rem*rem);
            num/=10;
            
        }
        
        
        if(arm==orginal){
            System.out.println(orginal+" The number is an armstrong number");
        }
        else
            System.out.println(orginal+" The number is not armgstong number ");
        
    }
}
