
package com.mycompany.javamainclass.prime.ct;

class M{
    M(){
        System.out.println("v");
    }
    static {
        System.out.println("j");
        System.out.println("a");
    }
    
    void hi(){
        System.out.println("M class method ");
    }
}
class N extends M{
    N(){
       System.out.println("1B");
   }
    static {
        System.out.println("a");
        System.out.println("6");
    }
   
   @Override
   void hi(){
       super.hi();
       System.out.println("N class method");
   }
}
public class Ct1 {
    public static void main(String[] args) {
//        M m=new M();
//        N n=new N();
//        n.hi();
        N mn=new N();
        
    }
}

