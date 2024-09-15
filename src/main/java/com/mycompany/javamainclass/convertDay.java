/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamainclass;
import java.util.Scanner;
public class convertDay {
    public static void main(String[] args) {
        int days,years,weeks,months,restdays;
        System.out.println("Enter Days :");
        Scanner inp=new Scanner(System.in);
        days=inp.nextInt();
        
        years=days/360;
        System.out.println("Year :"+years);
        
        days=days-(years*365);
        months=days/30;
        System.out.println("Months :"+months);
        days=days-(months*30);
        weeks=days/7;
        
        System.out.println("Weeks :"+weeks);
        restdays=days-(weeks*7);
        System.out.println("Days :"+restdays);
     
    }

    
}
