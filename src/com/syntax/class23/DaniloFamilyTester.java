package com.syntax.class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {

        DaniloParents daniloParents=new Danilo();


        DaniloParents[] familyArray=new DaniloParents[3];
        familyArray[0]=new Danilo();
        familyArray[1]=new Jelena();
        familyArray[3]=new MIlos();

        for(DaniloParents dp:familyArray){
            dp.eat();
            dp.sleep();
            print(familyArray);
        }
    }

    public static void print(DaniloParents[] daniloParents) {
        for (DaniloParents dp : daniloParents) {
            dp.eat();
            dp.sleep();

        }
    }
}