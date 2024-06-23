class Sum_of_Array
{
	public static void main(String [] args)
	{
		int[] arr=new int [5];
		int sum=0;
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];

		}
		System.out.println("The Sum of Array ELment is:"+sum);
	}
}