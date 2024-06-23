import java.io.DataInputStream;
import java.io.IOException;
class Main
{
	private int fno,sno,ans;
	public void setData()
	{
		DataInputStream d = new DataInputStream(System.in);
		try{
			 System.out.println("Enter Two Numbers = ");
			 fno=Integer.parseInt(d.readLine());
			 sno=Integer.parseInt(d.readLine());

		}
		catch(IOException ioe)
		{}
	}
	public void sum()
	{
		ans=fno+sno;
	}
	public void printData()
	{
		System.out.println("Addition = "+ans);
	}

	public static void main(String[] args)
	{
		Main m = new Main();
		m.setData();
		m.sum();
		m.printData();
	}
}
//Note we can declare all methods as private except main method and all methods called in a one public method;