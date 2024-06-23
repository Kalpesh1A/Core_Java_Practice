import java.io.DataInputStream;
import java.io.IOException;
class MaxofThree
{
	public static void main(String[] args)
	{
		DataInputStream d= new DataInputStream(System.in);
		System.out.println();
		int fno=0,sno=0,tno=0;
		System.out.println("For Maximum of Three : ");
		try
		{
			System.out.println("Enter Fno = ");
			fno=Integer.parseInt(d.readLine());
			System.out.println("Enter Sno = ");
			sno=Integer.parseInt(d.readLine());
			System.out.println("Enter Tno = ");
			tno=Integer.parseInt(d.readLine());
		}
		catch(IOException ioe)
		{
		}
		if(fno==sno && sno==tno)
			System.out.println("All are  Equal " );
		else
			if(fno>sno && fno>tno)
				System.out.println("Fno is Great");
			else
				if(sno>tno)
					System.out.println("Sno is Great");
				else
					System.out.println("Tno is Great");
	}
}