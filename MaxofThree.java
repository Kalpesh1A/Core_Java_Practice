class MaxofThree
{

	public static void main(String[] args)
	{
		int fno=5,sno=10,tno=15;
		if(fno==sno && sno==tno)
		{
			System.out.println("ALL ARE EQUAL");
		}
		else
		{
			if(fno>sno && fno>tno)
			{
				System.out.println("Greatest is :"+fno);
			}
			else
			{
				if(sno>tno)
				{
					System.out.println("Greatest is :"+sno);
				}
				else
				{
					System.out.println("Greatest is :"+tno);
				}
			}
			
		
		}
	}
}