import java.io.*;
class Test
{
	public static void main(String...args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number");
		int x=Integer.parseInt(br.readLine());
		System.out.println(x+1);


	}


}