class Mohit
{
	int data=100;

	void m2(Mohit m)
	{
		m.data=m.data+100;
	}

}
class CallByRef
{
	public static void main(String[] args)
	{
		Mohit m = new Mohit();

		System.out.println("Usint call by value Data = "+m.data);
		m.m2(m);
		System.out.println("Using Call by ref Data = "+m.data);

	}
}