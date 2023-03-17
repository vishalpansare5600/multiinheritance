package multipleinhe;

public interface Parent 
{
	
	final int a=10;
	abstract void  method2();
	 void method();
	default void defaultMethod()
	 {
		 System.out.println("default method");
		 }
	static void method6()
	{
		System.out.println("static method6");
	}

}
