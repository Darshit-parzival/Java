import java.util.*;
 
class Prg_5 {
     
    static int SIZE = 10;
 
    static void sortMat(int mat[][], int n)
    {
        int temp[] = new int[n * n];
        int k = 0;
     
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = mat[i][j];
     
        Arrays.sort(temp);
         
        k = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = temp[k++];
    }
     
    static void printMat(int mat[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print( mat[i][j] + " ");
            System.out.println();
        }
    }
     
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);

        System.out.print("Enter size of Row and Column: ");
        int n = read.nextInt();

        int mat[][] = new int[n][n];
     
        System.out.println("Original Matrix:");
        printMat(mat, n);
     
        sortMat(mat, n);
     
        System.out.println("Matrix After Sorting:");
        printMat(mat, n);
        
        read.close();
    }
}