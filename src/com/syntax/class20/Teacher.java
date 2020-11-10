package com.syntax.class20;

public class Teacher {
    int yearOfExperience;
        String name;
        String subject;
        Teacher(String name,int yearOfExperience,String subject){
            this.name=name;
            this.yearOfExperience=yearOfExperience;
            this.subject=subject;
        }
        Teacher(){
        }
        public void printTeacher(String name, int yearOfExperience,String subject){
            System.out.println("\nMy name is "+name+",\nI am a "+subject+" teacher with "+yearOfExperience+" years of experience");
        }
    }






