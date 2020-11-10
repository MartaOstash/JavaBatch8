package com.syntax.class20;

public class TeacherTester {
    public static void main(String[] args) {
        MatchTeacher t2=new MatchTeacher();
        ChemistryTeacher t3=new ChemistryTeacher();
        PianoTeacher t4=new PianoTeacher();
        t2.printTeacher("John",25,"Mathematics");
        t2.printMatch();
        t3.printTeacher("Daniela",6,"Chemistry");
        t3.printChemistry();
        t4.printTeacher("Sara",2,"Piano");
        t4.printPianoTeacher();
    }

}