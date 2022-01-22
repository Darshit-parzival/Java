import java.util.*;

class Count_Number {
 
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n=read.nextInt();

        int[] cnt=new int[9];
      

        for (int i = 0; i < cnt.length; i++) {
            
            cnt[i]=0;
        }

        int lastDigit,i=0;

        while(n>0) {

            lastDigit=n%10;
            if (lastDigit==i) {
                
                cnt[i]++;
            }
            n=n/10;
            i++;
        }

        for (int j = 0; j < cnt.length; j++) {
            
            if(cnt[j]!=0)
                System.out.println(cnt[j]);
        }

        read.close();
    }
}
