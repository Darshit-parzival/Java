import java.util.Scanner;

public class Prg_1 {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        int i, j,n=5;  
        for(i=0; i<n; i++) 
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++)
            {       
                System.out.print("* ");
            }           
            System.out.println(); 
            read.close();

    }
}
