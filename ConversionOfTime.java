package JAVA;
import java.util.Scanner;

public class ConversionOfTime {
    
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.println("Seconds to Hours:Minutes:Seconds");

        System.out.print("Enter Seconds:");
        long Seconds=read.nextLong();

        long Hours=Seconds/3600;
        long Minutes=(Seconds-(Hours*3600))/60;
        Seconds =(Seconds-(Hours*3600)-(Minutes*60));

        System.out.println("\n"+Hours+":"+Minutes+":"+Seconds);

        read.close();
    }
}
