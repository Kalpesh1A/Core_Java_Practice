import java.util.Scanner;
class InputDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int fno=0;
		int sno=0;
		System.out.print("Enter First Number = ");
		fno=sc.nextInt();
		System.out.print("Enter Second Number = ");
		sno=sc.nextInt();
		System.out.println("Addition of "+fno+" and "+sno+" = "+(fno+sno));
		System.out.println("\n\n");
	}
}

