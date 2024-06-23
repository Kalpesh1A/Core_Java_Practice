class Emp
{
	int eid;
	int salary;
	static String ceo;
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
	static
	{
		ceo="layra";
	}



}
public class StaticDemo
{
	public static void main(String[] args)
	{
		Emp navin=new Emp();
		navin.eid=8;
		navin.salary=4000;


		Emp rahul=new Emp();
		rahul.eid=5;
		rahul.salary=4000;

		navin.show();
		rahul.show();


	}

}