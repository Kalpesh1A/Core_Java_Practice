import java.util.Scanner;
class Arraydemo1
{
public static void main(String[] args)
{
	 Scanner sc = new Scanner (System.in);
	 int size,i;
	 System.out.println("Enter Size of Array:");
	 size=sc.nextInt();
	 int []arr=new int[size];
	 System.out.println("Enter Array Element:");
	 for(  i=0;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Your Array Elements are:");
	 for( i=0;i<size;i++)
	 {
		 System.out.print(" "+arr[i]);
	 }

}

}