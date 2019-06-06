package studystuff_interview_questions_all;

// The below is a great example for clarifying the difference between static and non static data members
// As defination specifies, This example also states that static members are not associated with objects hence In below example, 
// when user trying to set static data members with values associated with different object,
// It is observed that values are not set w.r.t each object because of the static nature
// Thus the last value is set to static data members but if you remove static or use non static , you will see
// The values are updated as per they set by different objects because unlike static members, non static data members are associated with objects
public class DifferenceStaticAndNonStatic 

{

	 int student_roll_no;
	 String student_name;
	 String student_college;
	
	public  DifferenceStaticAndNonStatic(int stu_roll,String stu_name, String stu_college)
	{
		
		student_roll_no=stu_roll;
		student_name=stu_name;
		student_college=stu_college;
	}
	
	public  void displayStudentInformation()
	{
		
		System.out.println("Student roll No is "+student_roll_no);
		System.out.println("Student Name is "+student_name);
		System.out.println("Student College name is "+student_college);
	}
	
	public static void main(String[] args) 
	
	{
		
		DifferenceStaticAndNonStatic stu1=new DifferenceStaticAndNonStatic(318, "Gaurav", "SBIT");
		DifferenceStaticAndNonStatic stu2=new DifferenceStaticAndNonStatic(319, "Gulshan", "Hindu");
		DifferenceStaticAndNonStatic stu3=new DifferenceStaticAndNonStatic(320, "Hemant", "BM");
		
		stu1.displayStudentInformation();
		stu2.displayStudentInformation();
		stu3.displayStudentInformation();

	}

}
