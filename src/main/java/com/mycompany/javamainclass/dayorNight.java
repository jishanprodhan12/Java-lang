
package com.mycompany.javamainclass;

import java.util.Scanner;

public class dayorNight {
    public static void main(String[] args) {
      
          Scanner in=new Scanner(System.in);
          
    System.out.println("If the sun is rise then Enter ture else enter false ");
    boolean sun=in.nextBoolean();
    if(sun== true ){
        System.out.println("it's day");
    }
    else {
        System.out.println("it's night ");
    }
    
      }  
    
    
}
