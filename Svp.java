interface Itf
{
	void m1();
	void m2();
}
abstract class Svp implements Itf
{
	public void m1()
	{
		System.out.println("M1 Method ");
	}
}
class Ssvp extends Svp
{

		public void m2()
		{
			System.out.println("M2 Method");
		}
}