 import java.io.DataInputStream;
 import java.io.IOException;
 class Kalpesh
 {
	 public static void main(String[] arga)
	 {
		 DataInputStream d = new DataInputStream(System.in);

		 int x=0,money =0;

		string str = "234";

		int a  = Integer.parseInt(str);


		try{
			money = Integer.parseInt(d.readLine());
			x= Integer.parseInt(d.readLine());
		}
		catch(IOException e){}


		 System.out.println(x);

	 }
 }