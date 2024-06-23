class Command_Line_Add
{
	public static void main(String[] args)
	{
		System.out.println("Enter Two Number For Addition");
		System.out.println("Enter First Number:");
		int fno=Integer.parseInt(args[0]);
		System.out.println("Enter Second Number:");
		int sno=Integer.parseInt(args[1]);
		int ans=fno+sno;
		System.out.println("The Addition is :"+ans);


	}
}