import java.util.Scanner;

class Prg_6 {

	public static void main(String args[]) {

		Scanner read=new Scanner(System.in);

		System.out.print("Enter the number :");
		int n=read.nextInt();

		int backup=n;
		int lastDigit=n%10;

		while(n>10)
		{
			n=n/10;
		}

		int firstDigit=n;
		n=backup/10;

		int r=0,c,d;

		while(n>10)
		{
			c=n%10;
			r=r*10+c;
			n=n/10;
		}

		int swap=lastDigit;
		
		while(r>0)
		{
			d=r%10;
			swap=swap*10+d;
			r=r/10;
		}

		swap=swap*10+firstDigit;

		System.out.println("After swap:"+swap);

		read.close();
	}
}