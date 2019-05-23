package studystuff_innerclass;

// Internal working of Java member inner class

// The java compiler creates two class files in case of inner class. 
// The class file name of inner class is "Outer$Inner". 
// If you want to instantiate inner class, you must have to create the instance of outer class. 
// In such case, instance of inner class is created inside the instance of outer class.


public class InnerClassInsideOuterClass 

{
	
	private int b=20;

	void function1()
	{
		int a=10;
	}
	

	public class Java_Inner_Class
	{
		
		void function1()
		{
		// As we know , A private data member is not accessible to other class 
		// but here you can see in inner class(though a different class to a private variable where it was declared), it is allowed	
			System.out.println(b);
		}
	}
	
	
	protected class Java_Inner_Class2
	{
		
	}
	
	class Java_Inner_Class3
	{
		
	}
	
	private class Java_Inner_Class4
	{
		
	}
	
	static class Java_Inner_Class5
	{
		
	}
	
	public interface interface1
	{
		// interface can also be declared inside class with all modifiers applicable on them
	}
	
	protected interface interface2
	{
		// interface can also be declared inside class with all modifiers applicable on them
	}
	interface interface3
	{
		// interface can also be declared inside class with all modifiers applicable on them
	}
	private interface interface4
	{
		// interface can also be declared inside class with all modifiers applicable on them
	}
	
	static interface interface5
	{
		// interface can also be declared inside class with all modifiers applicable on them
	}
	
	
	public static void main(String[] args) 
	
	{
			InnerClassInsideOuterClass obj=new InnerClassInsideOuterClass();
			InnerClassInsideOuterClass.Java_Inner_Class obj2=obj.new Java_Inner_Class();
			obj2.function1();
	}

}
