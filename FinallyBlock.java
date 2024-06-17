package exceptionhandling;

public class FinallyBlock {
                 public static void main(String[] args)
                 {
                	try {
                		
                		 System.out.println(2 / 0);
                	 }
                	 catch(ArithmeticException e)
                	{ 
                		 System.out.println("1st block executed");
                		 System.out.println(e);
                	 }
                	 finally
                	 {
                		 System.out.println("Finallyblock");
                	 }
                 }
}
