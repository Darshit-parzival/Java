import java.util.Scanner;

class PrimePalidrome {

    PrimePalidrome(int num) {

       int m=num/2,count=0;

       if (num==0||num==1) {
           
        System.out.println("The number "+num+" is not prime");
       }
       else {

        for (int i = 2; i <= m; i++) {
            
            if (num%i==0) {
                
                count=1;
            }
        }
       }

       if (count==0) {
           
            System.out.println("The number "+num+" is Prime");
       }
       else {

            System.out.println("The number "+num+" is not prime");
       }
    }

    PrimePalidrome(String s) {

        int i=0,j=s.length()-1;
        boolean ans=true;

        while(i<j) {

            if (s.charAt(i)!=s.charAt(j)) {
                ans=false;
            }

            i++;
            j--;
        }

        if (ans==true) {
            
            System.out.println("The String "+s+" is Palidrome");
        }
        else {

            System.out.println("The String "+s+" is not Palidrome");
        }
    }
}

public class Prg_5 {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        
        System.out.print("Enter number to find if it is Prime or not:");
        int n=read.nextInt();
 
        System.out.println("\n===============================================================");
        System.out.println("\t\tPrime Number\n\n");
        PrimePalidrome obj1=new PrimePalidrome(n);
        System.out.println("\n===============================================================\n\n");
        
        System.out.print("Enter String to find if it is Palidrome or not:");
        String str=read.nextLine();

        System.out.println("\n===============================================================");
        System.out.println("\t\tPalidrome String\n\n");
        PrimePalidrome obj2=new PrimePalidrome(str);
        System.out.println("\n===============================================================\n\n");
        
        read.close();
    }
}