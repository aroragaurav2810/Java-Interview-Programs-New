package studystuff_innerclass;

public interface InnerClassInsideInterface 

{

	public  class InnerClass
	{
		// Yes, you can make only public(but not private and protected) inner class inside an interface. 
	}
	
	static class InnerClass1
	{
		// Yes, you can also make  static inner class inside an interface. 
	}
	
	class InnerClass2
	{
		// Yes, you can make default inner class inside an interface. 
	}
	
	interface interface1
	{
		// Yes, you can make only public(but not private and protected) inner interface inside an interface.
	}
	
	interface interface2
	{
		// Yes, you can make default(but not private and protected) inner interface inside an interface.
	}
	
	static interface interface3
	{
		// Yes, you can make default(but not private and protected) inner interface inside an interface.
	}
	 
}
