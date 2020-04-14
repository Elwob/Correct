package com.company;

public class Department {
    // Versucht folgendes Diagramm mit Objekten abzubilden:
    //Aufgabe
    //Die “Abteilungen” Vorstand, Vertrieb, … sollten
    //in Abteilungsobjekte abgelegt werde, jeder
    //dieser Abteilung kann ein Leiter zugeordnet
    //werden (Personen Objekt).
    //Am Ende sollte in unserer Konsole ein Output
    //ähnlich dem linken dargestellt werden. (nur
    //schöner ;))
    //Zusatz: Füllt die Abteilung mit Mitarbeitern und
    //lasst die Mitarbeiter Abteilungen switchen
    //z.B. Abteilung.switch(person, Zielabteilung).
    //Die Abteilung soll eine Eigenschaft besitzen,
    //welche die Mitarbeiteranzahl speichert


    String departmentName;
    Person departmentLeader;
    int employeeCount = 0;
    Person temp;
    Department[] subDepartment = new Department[10];
    Person[] departmentEmployee;
    int depCount = 0;

    public Department(String departmentName, Person departmentLeader) {
        this.departmentName = departmentName;
        this.departmentLeader = departmentLeader;
        depCount++;
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        depCount++;
    }


    public void switchEmployee(String departmentName, Person persons) {
        //    this.departmentEmployee[]

    }


    public void addEmployee(Person persons) {
        departmentEmployee[employeeCount] = persons;
        employeeCount++;
    }

    public void addSubdepartment(Department department) {
        subDepartment[depCount] = department;
        depCount++;
    }


    public void printDepTree(String tab) {
        tab = tab + "\t";
        for (int i = 0; i < subDepartment.length; i++) {
            if (subDepartment[i] != null) {
                System.out.println(tab + "\t" + subDepartment[i].departmentName + " " + "(" + subDepartment[i].departmentLeader.firstName + ")");
                subDepartment[i].printDepTree(tab);
            }
        }
    }

    public void printDep() {
        System.out.println("Abteilung:  " + this.departmentName + ":");
        System.out.println("\t" + this.departmentLeader.firstName + " " + this.departmentLeader.lastName);
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println("Mitarbeiter: ");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(departmentEmployee[i]);

        }


    }


    public int getDepCount() {
        return depCount;
    }

    public void setDepCount(int depCount) {
        this.depCount = depCount;
    }


    public Person[] getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(Person[] departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Person getDepartmentLeader() {
        return departmentLeader;
    }

    public void setDepartmentLeader(Person departmentLeader) {
        this.departmentLeader = departmentLeader;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Person getTemp() {
        return temp;
    }

    public void setTemp(Person temp) {
        this.temp = temp;
    }

    public Department[] getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(Department[] subDepartment) {
        this.subDepartment = subDepartment;
    }


}
