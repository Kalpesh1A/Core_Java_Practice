class Arrays_of_Arrays
{
	public static void main(String[] args)
	{
		int x[][]=new int[2][3];		//Referrence Variable
		System.out.println(x);			//I@64747
		System.out.println(x[0]);		//I@64747
		System.out.println(x[0][0]);	//0

		int x1[][]=new int[2][];
		System.out.println(x1);
		System.out.println(x1[0]);
		System.out.println(x1 [0][0]);//null pointer exeption

		int arr[]=new int[5];
		System.out.println(arr[9]);
	}
}