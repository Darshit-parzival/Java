import java.util.Scanner;

class shape {

    void area(Float num)
    {
        System.out.println("\n\n\n");
        System.out.println("Area of circle: "+(num*num*3.14));
        System.out.println("---------------------------------------------------------------------");
    }

    void area(int wid,int len)
    {
        System.out.println("\n\n\n");
        System.out.println("Area of Ractangle: "+(wid*len));
        System.out.println("---------------------------------------------------------------------");
    }

    void area(Long bs,Long ht)
    {
        System.out.println("\n\n\n");
        System.out.println("Area of circle: "+(bs*ht));
        System.out.println("---------------------------------------------------------------------");
    }
}

public class Prg_2 {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Circle Radius:");
        float radius=read.nextFloat();
        
        System.out.print("Enter Ractangle Width:");
        int Width=read.nextInt();
        
        System.out.print("Enter Ractangle Length:");
        int Length=read.nextInt();
        
        System.out.print("Enter Parallelogram Base:");
        int Base=read.nextInt();
        
        System.out.print("Enter Parallelogram Height:");
        int Height=read.nextInt();

        shape obj=new shape();
        obj.area(radius);
        obj.area(Width,Length);
        obj.area(Base,Height);

        read.close();
    }
}
