import java.util.Scanner;

class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Length:");
		int n=read.nextInt();

		int t1 = 0, t2 = 1, nextTerm = 0;

		for (int i = 1; i <= n; ++i) {
        
        	if(i == 1) {
           		
           		continue;
        	}
        	if(i == 2) {
         		System.out.print(t2+", ");
           		continue;
        	}
       
       		nextTerm = t1 + t2;
       		t1 = t2;
        	t2 = nextTerm;
        
        	System.out.print(nextTerm+", ");
    	}
	}
}