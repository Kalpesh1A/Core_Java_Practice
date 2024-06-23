class Command_Line_Two_String
{
	public static void main(String[] args)
		{
		 String[] argh={"X","Y","Z"};
		  args=argh;
			for(String s : args)
			{
				System.out.println(s);
			}
	}
}
//Here We Passing command A,B,c mbut they are replace by argh so output always gain x,y,z