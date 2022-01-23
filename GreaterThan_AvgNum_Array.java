package JAVA;
import java.util.Scanner;

public class GreaterThan_AvgNum_Array {
  
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.println("Enter to Find greater number of average number of an array");

        System.out.print("Enter size of array: ");
        int size=read.nextInt();

        int[] arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            
            System.out.print("Enter Elements in Array["+i+"]: ");
            arr[i]=read.nextInt();
        }

        double Avg=0;

        for (int i = 0; i < arr.length; i++)
            Avg+=arr[i];

        Avg/=arr.length;

        System.out.println("Elements that are greater than average value of array\n");

        for (int i = 0; i < arr.length; i++) {
            
            if(Avg<arr[i])
                System.out.println("Array["+i+"]: "+arr[i]);
        }
        
        read.close();
    }
}
