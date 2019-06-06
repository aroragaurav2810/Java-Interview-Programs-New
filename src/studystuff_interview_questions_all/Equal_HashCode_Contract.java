package studystuff_interview_questions_all;

import java.util.ArrayList;
import java.util.List;

public class Equal_HashCode_Contract 

{

	/* Question: what is java equal and hashCode contract?
	 * or Why we keep both equal() and hashCode() functions together.
	 * Answer:
	 * if 2 objects are equal, they MUST have the same hash code. 
	 * If 2 objects have the same hash code, it doesn’t mean that they are equal.
	 * So, to make the logic accurate, we keep both function together.
	 * Also,
	 * Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable … etc. 
	 * Overriding hashcode() alone doesn’t force java to ignore memory addresses when comparing 2 objects. Check this tutorial –
	 * 
	 * */
	
	
	String name;
	int age;
	double salary;
	
	
	public Equal_HashCode_Contract(String name,int age,double salary)
	{
			this.name=name;
			this.age=age;
			this.salary=salary;
			
	}
	
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
*/





	public static void main(String[] args) 
	
	{
			
		Equal_HashCode_Contract w1 = new Equal_HashCode_Contract("John", 18, 20000.00);
		Equal_HashCode_Contract w2 = new Equal_HashCode_Contract("John", 18, 50000.00);
		List<Equal_HashCode_Contract> workerlist=new ArrayList<>();
		workerlist.add(w1);
		workerlist.add(w2);
		System.out.println(workerlist.get(0).age);
		System.out.println(workerlist.get(1).age);
		System.out.println("w1 object equals to w2 object? "+w1.equals(w2));
	    System.out.print("w1 object's hashCode equals to w2 object's hashcode? ");
	    System.out.println(w1.hashCode() == w2.hashCode());	 

	}

}
