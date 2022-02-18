package io.github.venkyhegde.composite.university;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // creating supervisors
        Supervisor dean = new Supervisor("Dr.Tom", "Dean of CCI");
        Supervisor chairOfCS = new Supervisor("Dr. David", "Chair of CS");
        Supervisor chairOfBI = new Supervisor("Dr. David", "Chair of Bio Informatics");

        Professor csProf1 = new Professor("Dr. Dugen", "Professor", "9803524111");
        Professor csProf2 = new Professor("Dr. Holly", "Associate Professor", "9802436352");

        Professor biProf1 = new Professor("Dr. Huew", "Professor", "746525262");
        Professor biProf2 = new Professor("Dr. Milly", "Adjunct", "2635365762");


        // Professors of cs report to chair of cs
        chairOfCS.add(csProf1);
        chairOfCS.add(csProf2);

        chairOfBI.add(biProf1);
        chairOfBI.add(biProf2);

        // both the chairs report to dean
        dean.add(chairOfCS);
        dean.add(chairOfBI);


        // printing composition
        System.out.println("***************University***************");
        System.out.println(dean.getDetails());
        // getting chair under dean
        List<Faculty> chairs = dean.getFaculties();
        for (Faculty fact : chairs){
            System.out.println("\t"+fact.getDetails());
        }
        // getting cs professors
        List<Faculty> facultyList = chairOfCS.getFaculties();
        for (Faculty fact : facultyList){
            System.out.println("\t\t"+fact.getDetails());
        }

        // BI professors
        List<Faculty> facultyListBi = chairOfBI.getFaculties();
        for (Faculty fact : facultyListBi){
            System.out.println("\t\t"+fact.getDetails());
        }
    }
}
