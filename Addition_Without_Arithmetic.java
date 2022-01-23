/* Program to perform addition without using Arithmetic operators */

package JAVA;
import java.util.Scanner;

public class Addition_Without_Arithmetic {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.println("Enter Two numbers to perform Addition without Arithmetic Operators");

        System.out.print("Enter First number: ");
        int num1=read.nextInt();
        System.out.print("Enter Second number: ");
        int num2=read.nextInt();

        //Both number should be more than 0
        if (num1>0 && num2>0) {
            
            // Loop for Additioning
            while(num2!=0) {
    
                int carry=num1&num2; //Set of bits of both number
    
                num1=num1^num2; // Sum of both number where atleast one of them is not set
    
                num2=carry<<1; // Shifting one to num2 will gives sum of num1 & sum will store in num1
            }
            System.out.println("\nAddition: "+num1);
        }
        else {
            
            if(num1==0)
                System.out.println("\nAddition: "+num2);
            else
                System.out.println("\nAddition: "+num1);
        }

        read.close();
    }
}