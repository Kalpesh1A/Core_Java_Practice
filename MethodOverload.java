class Casio
{

	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j,int k)
	{
		System.out.println(i+j+k);
	}




}
public class MethodOverload
{
	public static void main(String[] args)
	{
		Casio obj =new Casio();
		obj.add(5,10);
		obj.add(5,10,15);

	}



}