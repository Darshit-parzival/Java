import java.util.*;

class Prg_1 {
 
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n=read.nextInt();

        int[] cnt=new int[9];

        int lastDigit=0;

        while(n>0) {

            lastDigit=n%10;
            cnt[lastDigit]++;
            n=n/10;
        }

        for (int j = 0; j < cnt.length; j++) {
            
            int count=cnt[j];
            if(count!=0)
                System.out.println(j+" reapeated "+count+" times");
        }

        read.close();
    }
}
