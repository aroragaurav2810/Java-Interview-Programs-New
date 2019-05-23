package studystuff_interview_questions_all;


// shadowing with reference variable


 class Bar 

{

	int barnum=28;
	
	public static void main(String str[])
	{
		
	}
}




class Foo
{
	Bar mybar=new Bar();
	
	void changeIt(Bar mybar)
	{
		mybar.barnum=99;
		System.out.println(mybar.barnum);
		mybar=new Bar();
		mybar.barnum=480;
		System.out.println(mybar.barnum);
		
	
	}
	
	
	
	public static void main(String str[])
	{
	Foo  obj=new Foo();
	System.out.println(obj.mybar.barnum);
	
	obj.changeIt(obj.mybar);
	System.out.println(obj.mybar.barnum);
	
	}
	
	 
	
}