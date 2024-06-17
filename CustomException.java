package exceptionhandling;

class YourException extends Exception
{
	public  YourException(int a)
	{
	
	}
}


public class CustomException {
          public static void main(String[] args)
          {
        	  try {
        		  throw new YourException(0/2);
        		
        		  
        	  }
        	  catch(YourException e)
        	  {
        		  System.out.println("Company");
        		  System.out.println(e);
        		  
        	  }
        	  
        	 
        	  
          }
}
