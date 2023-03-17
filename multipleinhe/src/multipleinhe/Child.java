package multipleinhe;

public class Child implements Parent,Superparent 
{

	
	public void method2() 
	{
		System.out.println("method2");
		
	}

	
	public void method1() 
	{
		System.out.println("method1");
		
	}
	
	@Override
	public void method() 
	{
		// TODO Auto-generated method stub
	
	}
	
	public static void main(String args[])
	{
		Child c=new Child();
		c.method1();
		c.method2();
		Parent.method6();
		Parent p=new Child();
		p.defaultMethod();
		
		}
}


