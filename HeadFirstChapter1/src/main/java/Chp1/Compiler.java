package Chp1;

public class Compiler {
    public static void main(String[] args) {
      int x = 5;
      while (x > 1){
          x=x-1;
          if(x<3){
              System.out.println("small x");
          }
      }

    }
}




//    int x =5;
//        while (x>1){
//            x=x-1;
//            if(x<3){
//                System.out.println("small x"); // needed extra curly brace
//            }
//        }


//    int x =1;
//        while (x<10) {
//        x=x+1;        //add this line
//        if (x>3){
//        System.out.println("big x"); // compiles but no output, will run forever
//        }
//        }
