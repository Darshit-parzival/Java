import java.util.Scanner;

public class Asc_Dsc_Arr {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Size of array:");
        int size=read.nextInt();

        int[] ar=new int[size];
        int tmp=0;

        for (int i = 0; i < ar.length; i++) {
            
            System.out.print("Enter Value in Array["+i+"]: ");
            ar[i]=read.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            
            for (int j = i+1; j < ar.length; j++) {
                
                if(ar[j]<ar[i]) {
                    tmp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=tmp;
                }
            }
        }

        System.out.println("\nIn Ascending Order\n");

        for (int i = 0; i < ar.length; i++) {
            
            System.out.println("Array["+i+"]: "+ar[i]);
        }

        for (int i = 0; i < ar.length; i++) {
            
            for (int j = i+1; j < ar.length; j++) {
                
                if(ar[j]>ar[i]) {
                    tmp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=tmp;
                }
            }
        }

        System.out.println("\nIn Decending Order\n");

        for (int i = 0; i < ar.length; i++) {
            
            System.out.println("Array["+i+"]: "+ar[i]);
        }

        read.close();
    }
}