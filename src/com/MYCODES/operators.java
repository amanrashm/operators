package com.MYCODES;

import java.util.Scanner;

public class operators{
    public static void main(String[]args){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter two values");

        char operator;


        Double a = x.nextDouble();
        Double b = x.nextDouble();

        System.out.println("Enter operator (+, -, *, /)");
       String operator1 = x.next();
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;


        if(operator1=="+"){

        }else if()

//        switch(operator){
//            case '+':{
//                System.out.print("Total after Addition is : "+addition);
//                break;
//            }
//            case '-' :
//            {
//                System.out.print("Total after Subtraction is : " +subtraction);
//                break;
//            }
//            case '*' :
//            {
//                System.out.print("Total after Multiplication is : "+multiplication);
//                break;
//            } 
//            case '/' :
//            {
//                System.out.print("Total after Division is : "+division);
//                break;
//            }
//            default :
//            {
//                System.out.print("Please select proper operator");
//                return;
            }
        }
    }
}
