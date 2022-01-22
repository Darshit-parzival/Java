import java.util.Scanner;

public class Matrix_Multiplication {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows=read.nextInt();
        System.out.print("Enter number of column: ");
        int columns=read.nextInt();
        
        int[][] mat1=new int[rows][columns];
        int[][] mat2=new int[rows][columns];
        int[][] mul=new int[rows][columns];

        System.out.println("Enter Elements in Matrix 1:\n");

        for (int i = 0; i < rows; i++) {

            for(int j = 0; j < columns; j++) {
            
            System.out.print("Matrix 1["+(i+1)+"]["+(j+1)+"]: ");
            mat1[i][j]=read.nextInt();
            }
        }

        System.out.println("\nEnter Elements in Matrix 2:\n");

        for (int i = 0; i < rows; i++) {

            for(int j = 0; j < columns; j++) {
            
            System.out.print("Matrix 2["+(i+1)+"]["+(j+1)+"]: ");
            mat2[i][j]=read.nextInt();
            }
        }

        System.out.println("\nMultiplication of Both Matrix: ");

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                mul[i][j]+=mat1[i][j]*mat2[i][j];
            }
        }

        for (int j = 0; j < rows; j++) {
            
            for (int j2 = 0; j2 < columns; j2++) {
                System.out.print(mul[j][j2]+" ");

                if(j2==columns-1)
                    System.out.println("\n");
            }
        }

        read.close();
    }
}
