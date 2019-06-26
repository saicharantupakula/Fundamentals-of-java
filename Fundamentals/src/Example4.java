
public class Example4 {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Given number is Positive");
		}
		else if(a<0)
		{
			System.out.println("Given number is Negative");
		}
		else
		{
			System.out.println("Given number is Zero");
		}
	}
}
