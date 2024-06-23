import java.io.*;
class Buff2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int fno,sno;
		System.out.println("enter fno:");
		fno=Integer.parseInt(br.readLine());
		System.out.println("Enter Sno:");
		sno=Integer.parseInt(br.readLine());
		int ans;
		ans=fno+sno;
		System.out.println(""+ans);
	}


}


