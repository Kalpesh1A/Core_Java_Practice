class Static_Instance_Mixed_Demo
{
	int x=10;
	static int y=20;
	public static void main(String[] args)
	{
		Static_Instance_Mixed_Demo t1= new Static_Instance_Mixed_Demo();
		t1.x=888;
		t1.y=999;
		Static_Instance_Mixed_Demo t2=new Static_Instance_Mixed_Demo();
		System.out.println(t2.x);
		System.out.println(t2.y);
		
	
	}
	
	

}