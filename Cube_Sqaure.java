import java.util.Scanner;

class Cube_Sqaure {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        
        int choice=0;

        do {
            
            System.out.println("Choose to calculate");
            System.out.println("\n1.Cube");
            System.out.println("2.Square");
            System.out.println("0.Exit");

            System.out.print("\nEnter your choice:");
            choice=read.nextInt();

            switch(choice) {

                case 1:Cube();
                break;

                case 2:Square();
                break;

                default:System.out.println("\nPress ENTER key to exit");
                break;
            }
            
        } while (choice!=0);

        read.close();
    }
    static void Cube()
    {
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Number to Find it's Cubic Value:");
        int n=read.nextInt();

        System.out.println("\nCube of "+n+"is "+n*n*n);

        read.close();
    }
    static void Square()
    {
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Number to Find it's Squaric Value:");
        int n=read.nextInt();

        System.out.println("\nCube of "+n+"is "+n*n);

        read.close();
    }
}
