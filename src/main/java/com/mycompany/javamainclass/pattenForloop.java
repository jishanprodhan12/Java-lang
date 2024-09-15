/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamainclass;

import java.util.Scanner;

public class pattenForloop {
    public static void main(String[] args) {
        int alphabet=64;
        int range;
        System.out.println("Enter your range ");
        Scanner in=new Scanner(System.in);
        range=in.nextInt();
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println((char)(alphabet+j)+ " ");
                }
         
        }
      System.out.println(" ");      
    }
}
