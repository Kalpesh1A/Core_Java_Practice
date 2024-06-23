class Static_Variable
{
	static   int x=10;
	public static void main(String[] args)
	{
		Static_Variable t=new Static_Variable();
		System.out.println("Using class name:"+Static_Variable.x);
		System.out.println("Using object name:"+t.x);
		System.out.println("Directly Access:"+x);
		t.method();
	}
	public void method()
	{
		System.out.println("Directly Access in method:"+x);
	}



}
/*
Static variable : A variable whose value is not varied from object to object called static variable.
		-Directly Acces from both static & non_static area while in static area we can access using classname,objectname & variable.
		-create with in class but outside of block,constructor etc.
		-JVM provides default values for instance variable.



*/