import java.util.Scanner;

class Prg_7 {

    
    int enno;
    String nm;
    char gen;
    static int count=0;

    {
        count+=1;
    }
    
    Prg_7() {
        
        Scanner read=new Scanner(System.in);
        
        System.out.print("Enter Enrollment no.:");
        enno=read.nextInt();
        
        System.out.print("Enter Name:");
        nm=read.nextLine();
        
        System.out.print("Enter Gender (M or F):");
        gen=read.next().charAt(0);
    }

    void disp() {

        System.out.println("Name: "+nm);
        System.out.println("Enrollment Number: "+enno);
        System.out.println("Gender: "+gen);

    }
    
    public static void main(String[] args) {
        
        Prg_7 ob=new Prg_7();

        ob.disp();

        System.out.println("Count of Objects: "+count);
        
    }
}

