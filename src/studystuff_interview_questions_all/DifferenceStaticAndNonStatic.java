package studystuff_interview_questions_all;

public class DifferenceStaticAndNonStatic 

{

	static int student_roll_no;
	static String student_name;
	static String student_college;
	
	public DifferenceStaticAndNonStatic(int stu_roll,String stu_name, String stu_college)
	{
		student_roll_no=stu_roll;
		student_name=stu_name;
		student_college=stu_college;
	}
	
	public void displayStudentInformation()
	{
		System.out.println("Student Name is "+student_name);
		System.out.println("Student roll No is "+student_roll_no);
		System.out.println("Student College name is "+student_college);
	}
	
	public static void main(String[] args) 
	
	{
		DifferenceStaticAndNonStatic stu1=new DifferenceStaticAndNonStatic(318, "Gaurav", "SBIT");
		DifferenceStaticAndNonStatic stu2=new DifferenceStaticAndNonStatic(319, "Gulshan", "SBIT");
		DifferenceStaticAndNonStatic stu3=new DifferenceStaticAndNonStatic(320, "Hemant", "SBIT");
		
		stu1.displayStudentInformation();
		stu2.displayStudentInformation();
		stu3.displayStudentInformation();

	}

}
