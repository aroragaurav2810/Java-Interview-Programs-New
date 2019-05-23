package studystuff_reflection_and_generic_enum_database;

import java.util.Comparator;

public class Student implements Comparator<Student>

{

//  hashCode() and equal() methods in java
//  Study Source:	
//  https://www.javaworld.com/article/2074996/hashcode-and-equals-method-in-java-object---a-pragmatic-concept.html	
//	In this regard there is a rule of thumb that if you are going to override the one of the methods( ie equals() 
//	and hashCode() ) , you have to override the both otherwise it is a violation of contract made for equals() 
//  and hashCode().
//  one best example, A Program with hashcode() and equals() methods and A Program without hashcode() and equals() methods
	
	public int roll_no;
	public String name;
	public double marks;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(marks);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll_no;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(marks) != Double
				.doubleToLongBits(other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll_no != other.roll_no)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Employee [roll_no=" + roll_no + ", name=" + name + ", marks="
				+ marks + "]";
	}


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}