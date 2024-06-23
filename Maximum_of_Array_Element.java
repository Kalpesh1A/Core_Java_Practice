class Maximum_of_Array_Element
{
	public static void main(String [] args)
	{
		int[] arr={10,30,20,40,60,50};
		int demo=arr[0];
		for(int i=1;i<6;i++)
		{
			if(arr[i]>demo)
			{
				demo=arr[i];
			}
		}





		System.out.println("Max Element is :"+demo);
	}
}