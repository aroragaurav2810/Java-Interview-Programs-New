package studystuff_interview_questions_all;

public class Example1 {

	public static void main(String[] args) 
	
	{
		
		
		int i=0;
		float f=45.986767f; // (We can write float/double in any way, see below but if decimal is used in float type value then we need to put f with float value)
		double d=49.887656d;// d is optional in all the way with value of type double
		double e=49.0;
		float g=56;
		float h=56f;
		double l=97;
		double k=67d;
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		  
		  Example1 obj1=new Example1();
		  Example1 obj2=new Example1();
		  Example1 obj3=new Example1();
		  Example2_new obj4=new Example2_new();
		  Example1 obj5=null;
		  Example1 obj6=null;
		  System.out.println(obj1==obj2); // false as object contains different value even they are of same class
		  System.out.println(obj1.equals(obj2));// false as object contains different value even they are of same class
		  System.out.println(obj5==obj6);// true because both containing same value
		  //System.out.println(obj5.equals(obj6)); // It must be true(because both containing same value) if null was not there means any other value let's say "Amit" with obj5 and "Amit" with obj6 (as it is in ss1 and ss2) 
		  // but commented as it throws null pointer exception
		  // because in above code, we are calling equals method with object having null value
		  StringBuilder sb1 = new StringBuilder("Amit");
		  StringBuffer sb2 = new StringBuffer("Amit");
		  System.out.println(sb1);
		  System.out.println(sb2);
		  
		  String ss1 = "Amit";
		  String ss2="Amit";
		  System.out.println(ss1);
		 // System.out.println(obj3==obj4); // commented as it was throwing 
		 // System.out.println(sb1==sb2);
		  System.out.println(sb1.equals(sb2)); // false as object of different class contains different value, Also false as object contains different value even they are of same class, 
		  System.out.println(sb1.equals(ss1)); // false as object of different class contains different value, Also false as object contains different value even they are of same class,
		  System.out.println("Poddar".substring(3)); 
		  System.out.println(ss1.equals(ss2));// true as both containing same value and also there is no null as it was in obj5 and obj6
		  System.out.println(ss1==ss2);// true as both containing same value and also it is true in case of null as well(as it was in obj5 and obj6)
		  System.out.println(12>>3); // explain below
		  System.out.println(12<<3);// explain below
		  System.out.println(12>>>2);// explain below
		  System.out.println(12<<2);// explain below
		  String s = "Hello";
		  s+= "Adobe";
		  s.trim(); // doubtful
		  System.out.print(s); 
	}

}

class Example2_new
{
	
}

// calculation

/*12= 00001100
12<<3(three zero added from right)
01100000
32+64=96

12=00001100
12>>3(three zero added from left)
00000001
1=1

12=00001100
12>>>2
00000011
2+1=3


12=00001100
12<<2
00110000
32+16=48*/
