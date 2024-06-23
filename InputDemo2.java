import java.io.DataInputStream;
import java.io.IOException;
class InputDemo2
{
	public static void main(String [] args)
	{
		DataInputStream d= new DataInputStream(System.in);
		int fno=0;
		int sno=0;
		try
		{
			System.out.print("Enter First Number = ");
			fno=Integer.parseInt(d.readLine());
			System.out.print("Enter Second Number = ");
			sno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{

		}
		System.out.println("Addition is ="+(fno+sno));
	}
}
