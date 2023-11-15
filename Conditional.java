class Conditional
{
	public static void main(String args [])
	{
		int a = 10;
		int b = 50;
		String s = (a>b)?"a is grater ":"b is greater";
		int c = (a>b)?a:b;
		System.out.println(s);
		System.out.println(c + " is Greater");
	}
}