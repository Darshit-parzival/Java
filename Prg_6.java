import java.util.Scanner;

class Employee {

    int eid;
    String enm,edepartment;

    void Details() {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter EID:");
        eid=read.nextInt();

        System.out.print("Enter Employee Name:");
        enm=read.nextLine();

        System.out.print("Enter Department of Employee:");
        edepartment=read.nextLine();
        
        read.close();
    }
}

class Salary extends Employee {
    
    long Salary;
    int NoOfLeaves;

    void SalaryDetails() {

        Scanner read=new Scanner(System.in);

        System.out.print("Enter Salary of EID of Employee "+eid+" :");
        Salary=read.nextLong();

        System.out.print("Enter No. of Leaves taken by Employee with EID "+eid+" :");
        NoOfLeaves=read.nextInt();

        read.close();
    }
}

class Emp_Sal extends Salary {

    void Show() {

        System.out.println("EID of Employee:"+eid);
        System.out.println("Name of Employee:"+enm);
        System.out.println("Salary of Employee:"+Salary);
        System.out.println("No. of Leaves taken by Employee:"+NoOfLeaves);
    }
}

public class Prg_6 {

    public static void main(String[] args) {
        
        Emp_Sal obj=new Emp_Sal();

        obj.Details();
        System.out.println("\n\n");
        obj.SalaryDetails();
        System.out.println("\n\n");
        obj.Show();
        
    }
    
}
