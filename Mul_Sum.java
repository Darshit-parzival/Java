import java.util.Scanner;

class Mul_Sum {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        int choice;

        do {
            
            System.out.println("1.Multiplication");
            System.out.println("2.Sum");
            System.out.println("0.Exit\n\n");

            System.out.print("Enter your Choice: ");
            choice=read.nextInt();

            switch (choice) {
                
                case 1:
                    Multiplication();
                    break;
                
                case 2:
                    Sum();
                    break;
            
                default:
                    System.out.println("\nPress ENTER key to Exit");
                    break;
            }

        } while (choice!=0);

        read.close();
    }
    public static void Multiplication() {

        Scanner read=new Scanner(System.in);

        System.out.print("Enter Number to Find it's multiplication of all digits: ");
        int n=read.nextInt();

        int mul=1,lastDigit,backup=n;

        while(n>0) {

            lastDigit=n%10;
            mul=mul*lastDigit;
            n=n/10;
        }

        System.out.println("\nMultiplication of all Digits of "+backup+" is "+mul);

        read.close();
        
    }
    public static void Sum() {

        Scanner read=new Scanner(System.in);

        System.out.print("Enter Number to Find it's Sum of all digits: ");
        int n=read.nextInt();

        int sum=0,lastDigit,backup=n;

        while(n>0) {

            lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }

        System.out.println("\nAddition of all Digits of "+backup+" is "+sum);

        read.close();
        
    }
}