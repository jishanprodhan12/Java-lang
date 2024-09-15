
package com.mycompany.javamainclass;

import java.util.Scanner;
public class midTest2 {

	static String name;
	static int id;
    static void  nameIdPrint(String name, int id ){
		midTest2.name=name;
		midTest2.id=id;
                
	}
	static void show(){
		
		System.out.println("your name is : "+midTest2.name);
		System.out.println("your id is : "+midTest2.id);
	}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
		System.out.println("enter your name  and id number  : ");
		midTest2.nameIdPrint(in.nextLine(),in.nextInt());
                midTest2.show();
    }
}


