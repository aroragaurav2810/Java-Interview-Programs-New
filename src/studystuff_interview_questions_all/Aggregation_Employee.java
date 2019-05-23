
package studystuff_interview_questions_all;


class Aggregation_Address
{
	
	String city, state, country;
	public Aggregation_Address(String city, String state, String country) 
	{
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
	
}

public class Aggregation_Employee
{
	
	int id;
	String name;
	static Aggregation_Address obj2_address1; // Aggregation: Other Entity/Class Reference in other Class
	static Aggregation_Address obj2_address2; // Aggregation: Other Entity/Class Reference in other Class
	
	
	public Aggregation_Employee(int id, String name, Aggregation_Address address) 
	{
			
			System.out.println("Id, Name and Address of Employee is "+ id +" "+ name +" "+ address.city +" "+address.state +" "+address.country);
	}
	
	public static void main(String[] args) 
	{
		
	
	obj2_address1=new Aggregation_Address("Sonepat", "Haryana", "India");	
	obj2_address2=new Aggregation_Address("Karnal", "Haryana", "India");
	Aggregation_Employee obj1_e1=new Aggregation_Employee(101,"Gaurav",obj2_address1);// code reusability
	Aggregation_Employee obj1_e2=new Aggregation_Employee(60,"Anshul",obj2_address2); // code reusability
	
	}

}




