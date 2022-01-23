package JAVA;

import java.util.Scanner;

public class Ascii {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.println("Enter Any number,Character,Special Symbol of to find It's Ascii Value");

        System.out.print("Enter Element:");
        char N=read.next().charAt(0);

        int Ascii=N;

        System.out.println("Ascii Value of "+N+" : "+Ascii);
        read.close();
    }
}
