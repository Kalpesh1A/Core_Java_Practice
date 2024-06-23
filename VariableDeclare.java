class VariableDeclare	//camel-case method
{
	public static void main(String[] args)
	{
		int    i=5;	//     4 byte
		long   l=6666l;//  8 byte
		float  f=5.5f;// 4 byte
		double d=5.5;//	8 byte	note:double support int value also that is implicit conversion.
		short  s=5; // 2 byte
		byte   b=5; // 1 byte
		char ch='k';
		ch=66;	// it will print ASCII VALUE
		System.out.println(" "+i+" "+l+" "+f+" "+d+" "+ch);
	}



}
/*

	byte->short,char->int->long->float->double



*/