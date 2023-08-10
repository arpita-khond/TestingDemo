package app;

public class Calculator {
	//this are changes made by user b
	CalculatorService service;

	public void test1()
	{
		
	}
	public void test()

	{
		
	}
	public Calculator(CalculatorService service)
	{
		this.service=service;
	}
	public int getPercentage(int a, int b)
	{
		return (service.multiply(a, b))/100;
//		return (a*b)/100;
	}
	public int add(int...num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];			
		}
		return sum;
	}
	
	public int divide(int i, int j)
	{
		return i/j;
	}
	
	
}
