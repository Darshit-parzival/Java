import java.util.*;

public class Prg_7 extends TicketCancel {
    
    public static void main(String[] args) {

     int choice=0;
     Scanner read=new Scanner(System.in);

     System.out.println("Welcome to Ticket booking portal\n\n");
     Customers customers=new Customers();
     TicketBook book=new TicketBook();

        do{

            System.out.println("\n\n1.Booking Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.Display Ticket");
            System.out.println("0.Exit");

            System.out.print("Enter your choice:");
            choice=read.nextInt();

            switch (choice) {
                
                case 1:
                customers.details();
                book.Book();
                    
                    break;

                case 2:
                    TicketCancel cancel=new TicketCancel();
            
                    break;

                case 3:
                    book.show();

                    break;

                default:System.out.println("0 to exit");
                    break;
            }
        }while(choice!=0);

     read.close();
    }
}

class Customers {

    long CustomerNumber;
    String CustomerName,BoardingPoing,DestinationPoint;
    int CUID;

   void details() {

        int choice=0;

        Scanner read=new Scanner(System.in);
        Random random=new Random();

        System.out.print("Enter Customer Name:");
        CustomerName=read.nextLine();

        System.out.print("Enter Phone No. of Customer:");
        CustomerNumber=read.nextLong();

        CUID=random.nextInt(100);
        
        System.out.print("Your CUID Number is "+CUID);

        read.close();
    }
}

class TicketBook extends Customers {

    int NoOfTickets;
    
    void Book() {

        int choice=0;
        Scanner read=new Scanner(System.in);

        System.out.print("Enter No. of tickets:");
        NoOfTickets=read.nextInt();

        System.out.println("Choose Boarding Point\n\n");

        do {
            

            System.out.println("\n\n1.Junagadh");
            System.out.println("2.Rajkot");
            System.out.println("3.Ahemdabad");
            System.out.println("4.Surat");
            System.out.println("5.Jamnagar");
            System.out.println("0 to Exit");
            
            System.out.println("\nEnter Boarding Point of your journey");
            choice=read.nextInt();

            switch (choice) {
                case 1:
                    BoardingPoing="Junagadh";
                    System.out.println("\nBoarding Point:"+BoardingPoing);
                    
                    break;
                    
                case 2:
                    BoardingPoing="Rajkot";
                    System.out.println("\nBoarding Point:"+BoardingPoing);
                        
                    break;

                case 3:
                    BoardingPoing="Ahemdabad";
                    System.out.println("\nBoarding Point:"+BoardingPoing);
                        
                break;

                case 4:
                    BoardingPoing="Surat";
                    System.out.println("\nBoarding Point:"+BoardingPoing);
                        
                    break;

                case 5:
                    BoardingPoing="Jamnagar";
                    System.out.println("\nBoarding Point:"+BoardingPoing);
                        
                    break;

                default:System.out.println("Enter 0 to exit");
                    break;
            }
        } while (choice!=0);

        System.out.println("\n\n\nChoose Destination Point");
        choice=0;

        do {
            

            System.out.println("\n\n1.Junagadh");
            System.out.println("2.Rajkot");
            System.out.println("3.Ahemdabad");
            System.out.println("4.Surat");
            System.out.println("5.Jamnagar");
            System.out.println("0 to Exit");
            
            System.out.println("\nEnter Destination Point of your journey");
            choice=read.nextInt();

            switch (choice) {
                case 1:
                    BoardingPoing="Junagadh";
                    System.out.println("\nDestination Point:"+DestinationPoint);
                    
                    break;
                    
                case 2:
                    BoardingPoing="Rajkot";
                    System.out.println("\nDestination Point:"+DestinationPoint);
                        
                    break;

                case 3:
                    BoardingPoing="Ahemdabad";
                    System.out.println("\nDestination Point:"+DestinationPoint);
                        
                break;

                case 4:
                    BoardingPoing="Surat";
                    System.out.println("\nDestination Point:"+DestinationPoint);
                        
                    break;

                case 5:
                    BoardingPoing="Jamnagar";
                    System.out.println("\nDestination Point:"+DestinationPoint);
                            
                    break;

                default:System.out.println("Enter 0 to exit");
                    break;
            }
        } while (choice!=0);

        if(DestinationPoint==BoardingPoing) {

            System.out.println("\n\nDestination Point & Boarding Point is Same,Please Enter Data Correctly");
            Customers ob=new Customers();
            ob.details();
            TicketBook tb=new TicketBook();
            tb.Book();
        }
        
        if(NoOfTickets==1) {

            System.out.println("\n\nYour Ticket has been Booked");
        }
        else {

            System.out.println("\n\nYour Tickets have been Booked");
        }

        System.out.println("\n\nYour Ticket is\n"+BoardingPoing+" To "+DestinationPoint+" With Customer name: +"+CustomerName+" and CUID:"+CUID);   

        read.close();
    }

    void show() {

        System.out.println("Customer Name:"+CustomerName);
        System.out.println("Customer Phone Number:"+CustomerNumber);
        System.out.println("Customer CUID:"+CUID);

        if(NoOfTickets==1) {

            System.out.println("\n"+BoardingPoing+" To "+DestinationPoint+" ticket for "+NoOfTickets+" person");
        }
        else {

            System.out.println("\n"+BoardingPoing+" To "+DestinationPoint+" tickets for "+NoOfTickets+" Persons");
        }
    }
}

class TicketCancel extends TicketBook {
    
    TicketCancel() {

        Scanner read=new Scanner(System.in);

        System.out.println("Ticket cancellation Window");

        System.out.print("\n\nEnter your CUID:");
        int n=read.nextInt();
        
        if (n==CUID) {
            
            BoardingPoing=null;
            DestinationPoint=null;
            NoOfTickets=0;
            CustomerName=null;
            CustomerNumber=0;
            CUID=0;
            System.out.println("\n\nYour Ticket is successfully cancelled from CUID "+n);
        }
        else {

            System.out.println("\n\nCUID is not matched, Please Try again");
            TicketCancel tc=new TicketCancel();
        }

        read.close();
    }
}

