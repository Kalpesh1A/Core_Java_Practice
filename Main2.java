import java.io.DataInputStream;
import java.io.IOException;
class Add
{
	private int fno,sno,ans;
    void setData(int fno,int sno)
	{
		this.fno=fno;
		this.sno=sno;

	}

	int calc()
	{
		return fno+sno;
	}



}

class Main2
{
		public static void main(String[] args)
		{
			Add d = new Add();
			d.setData(10,20);
			int ans=d.calc();
			System.out.println("Addition = "+ans);


		}

}
//Note We call default Methods in another class because default is package level & this keyword used for separate Add class variables and Parameters