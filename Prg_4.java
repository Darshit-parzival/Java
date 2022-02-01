import java.util.Scanner;

public class Prg_4 {
         
    public static void main(String args[]){  
         
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Rows of Matrix: ");
        int rows=read.nextInt();
        
        System.out.print("Enter Columns of Matrix: ");
        int columns=read.nextInt();
        
        int arr[][]=new int[rows][columns];    
            
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                System.out.print("Enter Value in Array["+i+"]["+j+"]: ");
                arr[i][j]=read.nextInt();
            }
        } 

        int transpose[][]=new int[rows][columns];   
            
        for(int i = 0; i < rows; i++) {    
            
            for(int j = 0 ; j < columns; j++) {    
        
                transpose[i][j]=arr[j][i];  
            }    
        }    
          
        System.out.println("Printing Matrix After Transpose:");  
        
        for(int i = 0; i < rows; i++) {    
            
            for(int j = 0; j < columns; j++) {    
        
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println();    
            }  
            read.close();  
        }
    
    }
