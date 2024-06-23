class Var_Args_Sum_Example		//NOTE=it is least privority method .
{

	public static void sum(int ... x)//(int x,int...y)valid  we can use but last is var_args we cant change positionN
	{
		int total=0;					//not:we can take only one var_args parameters ex.int..x,int..y (Not valid)
		for(int i=0;i<x.length;i++)
		{
			total=total+x[i];
		}
		System.out.println("The Sum is :\t"+total);


	}
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);

	}


}
/*
class Test
{
 public static void sum(int... x)
 {
    int total=0;
    for(int x1 : x)
    {
	total=total+x1;
        }
         System.out.println("The sum :"+total);
}
public static void main(String[] args)
{
 sum();
 sum(10);
 sum(10,20);
 sum(10,20,30,40);
 }
}
Output:
The sum: 0
The sum: 10
The sum: 30
The sum: 100
*/