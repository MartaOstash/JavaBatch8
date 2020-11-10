package com.syntax.repl;

public class Repl119 {

    String censorLetter(String str, char c) {

            str=str.replace(c, '*');
            return str;
        }
        public static void main(String[] args){

            Repl119 obj=new Repl119();
            System.out.println(obj.censorLetter("computer science",'e')); //“comput*r sci*nc*”
            System.out.println(obj.censorLetter("trick or treat",'t')); //“*rick or *rea*”
        }
    }
