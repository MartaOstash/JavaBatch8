package com.syntax.repl;

import java.util.Scanner;

public class repl103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for(int i=0; i<=s.length()-1; i++){
            System.out.print(s.charAt(i)+" ");



    }
}}

