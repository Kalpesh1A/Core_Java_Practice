import java.util.Scanner;
class StudentDemo
{

	Scanner sc = new Scanner(System.in);
	private int roll;
	private String name;
	public StudentDemo()
	{

	}
	public StudentDemo(int r, String n)
		{
			roll=r;
			name=n;
			showData();
	}
	void setRoll()
	{
		System.out.println("\n\nEnter Roll Number = ");
		roll=sc.nextInt();

	}
	void setName()
	{
		System.out.println("\n\nEnter Name = ");
		sc.nextLine();
		name=sc.nextLine();

	}
	int getRoll()
	{
		return roll;
	}
	String getName()
	{
		return name;
	}
	void InputData()
	{
		setRoll();
		setName();
	}
	void showData()
	{
		System.out.println("\n\n");
		System.out.println("ROLLNO \t Name");
		System.out.println(getRoll()+"\t"+getName());

	}

}


class StudentDataDemo
{
	public static void main(String[] args)
	{
		StudentDemo s1 = new StudentDemo();
		System.out.println("\nEnter Data of Students : ");
		s1.InputData();
		s1.showData();
		StudentDemo s2 = new StudentDemo(1,"Ram");
		s2.showData();








	}
}
/*
import java.util.Scanner;

class StudentDemo {
    Scanner sc = new Scanner(System.in);
    private int roll;
    private String name; // Changed from int to String for storing name

    void setRoll() {
        System.out.println("\nEnter Roll Number: ");
        roll = sc.nextInt();
    }

    void setName() {
        System.out.println("\nEnter Name: ");
        sc.nextLine(); // Consume newline character
        name = sc.nextLine();
    }

    int getRoll() {
        return roll;
    }

    String getName() {
        return name;
    }

    void InputData() {
        setRoll(); // Call setRoll() to set the roll number
        setName(); // Call setName() to set the name
    }

    void showData() {
        System.out.println("\n\n");
        System.out.println("ROLLNO \t Name");
        System.out.println(getRoll() + "\t" + getName());
    }
}

class StudentDataDemo {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo();
        System.out.println("\nEnter Data of Student: ");
        s1.InputData();
        s1.showData();
    }
}
*/