package com.syntax.Class16;

import com.syntax.class08.Task;

public class Taks1 {


    public static void printLarger(double num1, double num2) {
        if (num1 < num2) {
            System.out.println(num2+" is larger");
        } else if(num1>num2) {
            System.out.println(num1+" is larger");
        }else{
            System.out.println(num1+" equals "+num2);

        }
    }
}