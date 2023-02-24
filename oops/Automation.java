package oops;

public class Automation extends MultipleLanguage
{

	public void selenium() {
		System.out.println("selenium");
		
	}

	public void java() {
		System.out.println("java");
		
	}
	
	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args)
	{
		Automation call=new Automation();
		call.selenium();
		call.java();
		call.ruby();
		
		
	}


}
