import java.io.IOException;
class CharInputDemo1
{
	public static void main(String[] args)
	{
		char ch='a';
		System.out.println("To check Wheather given Character is Capital ,Small ,Digit or Symbol ");
		try
		{
			System.out.print("Enter Any Character = ");
			ch=(char)System.in.read();
		}
		catch(IOException ioe)
		{
		}
		if(ch>='a' && ch<='z')
		{
			System.out.println("Small Alphabet ");
		}
		else if (ch<='A' && ch>='Z')
		{
			System.out.println("Capital Alphabet");
		}
		else if(ch<='0' && ch>='9')
		{
			System.out.println("Digit ");
		}
		else{
			System.out.println("Special Symbol");
			}


	}
}