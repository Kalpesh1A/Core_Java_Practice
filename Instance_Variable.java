class Instance_Variable
{
	int x=5;
	    public void method()
		{
			System.out.println(x+5);
		}

	public static void main(String[] args)
	{
		Instance_Variable t=new Instance_Variable();
		System.out.println(t.x);
		t.method();

	}

}
/*Instance variable : A variable whose value is varied from object to object called Instance Variable.
	-Directly access from non_static area but to acces in static area need to create object.
	-create with in class but outside of block,constructor etc.
	-JVM provides default values for instance variable.*/

