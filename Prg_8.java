import java.util.Scanner;

class Prg_8 {

    
    int radius;
    static int count=0;

    {
        count+=1;
    }
    
    Prg_8() {
        
        Scanner read=new Scanner(System.in);
        
        System.out.print("Enter Radius:");
        radius=read.nextInt();
        System.out.println("Radius: "+radius);
    }
    
    public static void main(String[] args) {
        
        Prg_8 ob=new Prg_8();

        System.out.println("Count of Objects: "+count);
        
    }
}

class Prg_8 {
    
}
