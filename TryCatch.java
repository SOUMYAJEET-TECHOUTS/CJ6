package exceptionhandling;

public class TryCatch {
	public static void main(String[] args)
	{
		String s = null;
		int a =10;
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(a);
		}
	}

}
