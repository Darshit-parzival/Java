import java.util.Scanner;

public class Array_Sum {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int size=read.nextInt();

        int[] arr=new int[size];
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            
            System.out.print("Enter value in Array["+i+"]: ");
            arr[i]=read.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("\nSum of All elements of Array: "+sum);

        read.close();
    }
}
