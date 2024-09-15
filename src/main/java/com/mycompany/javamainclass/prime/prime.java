
package com.mycompany.javamainclass.prime;

import java.util.Scanner;
public class prime {
    
       int isprime(){
        int num,count=0;
        do{
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a positive  integer number ");
        num=obj.nextInt();}while(num<=0);
        
        if (num==0 || num==1) {
            System.out.println(num+" is not a prime number ");
        }
        for (int i = 2; i <= num; i++) {
            if(num%i==0){
                count++;
                
            }
        }
        if (count==2) {
            System.out.println(num+" is not a prime number ");
          }
        else{
            System.out.println(num+" is a prime nunber ");
        }
           return 0;
        
    
    }
}
    
    

