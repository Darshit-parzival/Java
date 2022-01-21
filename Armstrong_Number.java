import java.util.Scanner;

class Armstrong_Number {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);

		System.out.print("Enter Number to check whether it is Armstrong or not: ");
		int n=read.nextInt();

		int tmp=n,r,sum=0;

		while(n>0) {

			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}

		if(sum==tmp)
				System.out.println("\n\n"+tmp+" Number is Armstrong");
		else
				System.out.println("\n\n"+tmp+" Number is not Armstrong");
	}
}