package oops;

public class AxisBank extends BankInfo
{

	public void deposit()
	{
		System.out.println(" Axisbank deposit");
	}
	public static void main(String[] args)
	{
		AxisBank call=new AxisBank();
		call.deposit();
	}
}
