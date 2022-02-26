import java.util.Scanner;

abstract class Bank {

    abstract void InterestRate();
}

class SBI extends Bank {

    void InterestRate(){

        Scanner read=new Scanner(System.in);

        System.out.println("Welcome in SBI bank");
        System.out.print("\n\nEnter your desired amount to calculate interest (per annum.):");
        long amount=read.nextLong();

        System.out.print("\n\n\n===================================================="+"\nInterest amount:"+((amount*5)/100)+"\nGross profit:"+(amount+((amount*5)/100)));
        read.close();
    }
}

class BOB extends Bank {

    void InterestRate(){

        Scanner read=new Scanner(System.in);

        System.out.println("Welcome in BOB bank");
        System.out.print("\n\nEnter your desired amount to calculate interest (per annum.):");
        long amount=read.nextLong();

        System.out.print("\n\n\n===================================================="+"\nInterest amount:"+((amount*5)/100)+"\nGross profit:"+(amount+((amount*5)/100)));
        read.close();
    }
}

class Yes extends Bank {

    void InterestRate(){

        Scanner read=new Scanner(System.in);

        System.out.println("Welcome in Yes bank");
        System.out.print("\n\nEnter your desired amount to calculate interest (per annum.):");
        long amount=read.nextLong();

        System.out.print("\n\n\n===================================================="+"\nInterest amount:"+((amount*5)/100)+"\nGross profit:"+(amount+((amount*5)/100)));
        read.close();
    }
}

public class Prg_4 {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        int choice=0;

        do {
            
            System.out.println("Select your Choice");
            System.out.println("\n\n1.SBI Bank");
            System.out.println("2.BOB Bank");
            System.out.println("3.Yes Bank");
            System.out.println("0.Exit");

            System.out.print("\nYour Choice:");
            choice=read.nextInt();

            switch (choice) {
                case 1:
                    Bank sbi=new SBI();
                    sbi.InterestRate();
                    
                    break;

                case 2:
                    Bank bob=new BOB();
                    bob.InterestRate();

                    break;

                case 3:
                    Bank yes=new Yes();
                    yes.InterestRate();

                    break;
            
                default:System.out.println("Press 0 to exit");
                    break;
            }
        } while (choice!=0);

        read.close();
    }
}