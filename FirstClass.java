public class FirstClass
{
  public static void main(String[] x)
  {
    	System.out.println("First JAVA code on GitHub!!");
	System.out.println("Director: Ioannis Eleftheriadis");
  }
  public static long fibonacci(long input)
  {
	long N_1 = 1; // The previous parameter
	long N_2 = 1; // The pre - previous parameter
	long res = 0; // The result
	
	if((input==0)||(input==1))
	{
		return N_1;
	}
	
	for(int i=0; i<=(input - 1); i++)
	{
		current = N_1 + N_2;
		N_2 = N_1;
		N_1 = res;
	}
	
	
	// return the result
	return res;
	
  }
}
