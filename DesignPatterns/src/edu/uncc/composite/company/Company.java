package edu.uncc.composite.company;

// this is the client
public class Company {

    public static void main(String[] args) {
        Employee manager = new Manager(1920,"Jhony Dip", "Manager" );
        Employee manager2 = new Manager(4530,"Josh", "Manager" );

        Employee dev = new Developer(1234,"Jennifer", "Java Developer");
        Employee dev1 = new Developer(45362,"Lauren", "Angular Developer");

        Directory managerDirectory = new Directory();
        managerDirectory.addEMployee(manager);
        managerDirectory.addEMployee(manager2);

        Directory developers = new Directory();
        developers.addEMployee(dev);
        developers.addEMployee(dev1);


        // company directory which has both composite and leaf
        Directory companyDirectory = new Directory();
        companyDirectory.addEMployee(managerDirectory);
        companyDirectory.addEMployee(developers);

        companyDirectory.showEmployeeDetail();
    }

}
