import java.util.Scanner;

interface Operation {

    void Withdraw(Double amount);
    void Deposit();    
}

class SBI implements Operation {

    static int SBIfund=5000;

    public void Withdraw(Double amount) {

        if (SBIfund<amount) {
            
            System.out.println("etla badha paisa nathi bank ma");
        } 
        else {
        
            SBIfund-=amount;
        }
    }
    
    public void Deposit() {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Ketla paisa jama karva na tamare:");
        int Deposit_amt=read.nextInt();

        SBIfund+=Deposit_amt;

        System.out.println("\n\n\n========================================================================"+"\nTamari rakam bank ma jama thai gai ch "+SBIfund);

        read.close();
    }

    public void ShowBalance() {
        
        System.out.println("Tamari pase atyare "+SBIfund+" mudi ch");
    }
}

class HDFC implements Operation {

    static int HDFCfund=5000;

    public void Withdraw(Double amount) {

        if (HDFCfund<amount) {
            
            System.out.println("etla badha paisa nathi bank ma");
        } 
        else {
         
            HDFCfund-=amount;
        }
    }
    
    public void Deposit() {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Ketla paisa jama karva na tamare:");
        int Deposit_amt=read.nextInt();

        HDFCfund+=Deposit_amt;

        System.out.println("Tamari rakam bank ma jama thai gai ch");

        read.close();
    }

    public void ShowBalance() {
        
        System.out.println("Tamari pase atyare "+HDFCfund+" mudi ch");
    }
}

class Menu {

    public void menu() {

        System.out.println("===========================================================================");
        System.out.println("SBI Khata dharit 1 dabavo");
        System.out.println("HDFC Khata dharit 2 dabavo");
        System.out.println("Bahar nikdva mate uprokt option sivay game te dabavo");
        System.out.println("===========================================================================");
        System.out.print("Tamari pasand vyakt karo:");
    }
    public void BankMenu() {
        
        System.out.println("===========================================================================");
        System.out.println("Jama karva mate 1 dabavo");
        System.out.println("Upad karva mate 2 dabavo");
        System.out.println("Bahar nikdva mate uprokt option sivay game te dabavo");
        System.out.println("===========================================================================");
        System.out.print("Tamari pasand vyakt karo:");
    }
    public void WithdrawMoney() {
        
    }
}

class Bank {
    
    Menu mn=new Menu();
    
    Bank(){
        
        Scanner read=new Scanner(System.in);
        int choice=0;
        
        do {
            
            mn.menu();
            choice=read.nextInt(); 
            
            switch (choice) {
                case 1: 
                SBI sbi=new SBI();
                int choiceSBI=0;
                System.out.println("===========================================================================");
                System.out.println("===========================================================================");
                
                do {
                    
                    System.out.println("\n\nSBI Sakha seva ma ame tamaru hardik swagat kriye chiye");
                    mn.BankMenu();
                    choiceSBI=read.nextInt();
                    
                    switch (choiceSBI) {
                        case 1:
                        sbi.Deposit();
                        choiceSBI=0;
                        choice=0;
                        
                        break;
                        
                        case 2:
                        System.out.print("Tamare ketlo upad karva no:");
                        Double amt=read.nextDouble();
                        sbi.Withdraw(amt);
                        choiceSBI=0;
                        choice=0;
                        
                        break;
                        
                        default:System.out.println("Bahar nikdva mate fari te j key dabavo je tme hmna dabavi");
                        break;
                    }
                } while (choiceSBI!=0);
                
                break;
                
                case 2:
                HDFC hdfc=new HDFC();
                int choiceHDFC=0;
                do {
                    
                    System.out.println("\n\nHDFC Sakha seva ma ame tamaru hardik swagat kriye chiye");
                    
                    switch (choiceHDFC) {
                        case 1:
                        hdfc.Deposit();
                        choiceHDFC=0;
                        choice=0;
                        
                        break;
                        case 2:
                        System.out.print("Tamare ketlo upad karva no:");
                        Double Amt=read.nextDouble();
                        hdfc.Withdraw(Amt);
                        choiceHDFC=0;
                        choice=0;
                        
                        break;
                        
                        default:System.out.println("Bahar nikdva mate fari te j key dabavo je tme hmna dabavi");
                        break;
                    }
                } while (choiceHDFC!=0);

                    default:System.out.println("Bahar nikdva mate fari te j key dabavo je tme hmna dabavi");
                    break;
                }
        } while (choice!=0);
        
        read.close();
    }
}

public class Prg_3 {
    
    public static void main(String[] args) {
        
        Bank obj=new Bank();
    }
}