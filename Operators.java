class Operators
{
	public static void main(String[] args )
	{
		int fno=6;
		int sno=5;
		int ans=fno+sno;
		int ans1=fno-sno;
		int ans2=fno/sno;
		double ans3=fno/sno;
		int ans4=fno%sno;

		System.out.println(" "+ans2);
		System.out.println(" "+ans3);
		System.out.println(" "+ans4);

		System.out.println(" "+fno);
		fno+=sno;
		System.out.println(" "+fno);

		int test=5;
		System.out.println(" "+test++);

		int test1=5;
		System.out.println(" "+(++test1));
	}

}