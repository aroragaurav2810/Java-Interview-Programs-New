package studystuff_interview_questions_all;

public class ComparePrimitivesandObjects


{

	
		public static void main(String[] args) 
		{
			 String a="10";
			 String b="10";
			

		System.out.println("when no object is created then == and equalto both are true");
		System.out.println("Like enum");	 
		System.out.println("a==b ? "+ (a==b));
		System.out.println("a.equals(b) ? "+ (a.equals(b)));
		

		 String a1=new String("10");
		 String b1=new String("10");

		 
		System.out.println("when object is created then == check location and equalto checks content"); 
		System.out.println("a1==b1 ? "+ (a1==b1));
		System.out.println("a1.equal(b1) ? "+ (a1.equals(b1)));
		
		
		 StringBuffer a2=new StringBuffer("10");
		 StringBuffer b2=new StringBuffer("10");

		System.out.println("when object is created and class is non primitive(like StringBuffer) then == check location and equalto also checks location"); 
		System.out.println("a2==b2 ? "+ (a2==b2));
		System.out.println("a2.equal(b2) ? "+ (a2.equals(b2)));
				
				
				
			}
	
	
}
