
class Addition
{
	private int fst=5,sec=10,ans;
	void sum()
	{
		ans=fst+sec;
		System.out.println("Addition = "+ans);
	}
	void sum(int fst,int sec)
	{
		ans=fst+sec;
		System.out.println("Addition = "+ans);
	}
	int sum(int fst)
	{
		return fst+sec;
	}


}




class OverLoadingDemo
{
	public static void main(String[] args)
	{
		Addition d = new Addition();
		d.sum();
		d.sum(10,20);
		int ans=d.sum(50);
		System.out.println("Ans = "+ans);

	}
}