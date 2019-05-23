package studystuff_geeksforgeeks_keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeywordOrSerialization implements Serializable

{

// Transient is a variable keyword that is used in Serialization	
// Transient keyword with static variable: No impact because static is not a part of state 
// Transient keyword with final variable: No impact because final variables are directly serialized by their value	
// Transient keyword stops a variable value to write on a stream
// Real Time Example: Let's say you are writing the state of student objects in a file 
// and that object contains password of each student. Thus to prevent that, we will apply transient
// in front of password parameter of student object	
	
	
	
	int stu_name=10, stu_rollno=20;
	transient int stu_password=30;
	transient static int stu_email=40;
	transient final int stu_address=50;
	
	public static void main(String[] args) throws Exception
	{
		
		TransientKeywordOrSerialization input=new TransientKeywordOrSerialization();
		FileOutputStream fout=new FileOutputStream(System.getProperty("user.dir")+"\\abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(input);
		oos.close();
		
		
		
		FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"\\abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		TransientKeywordOrSerialization output=(TransientKeywordOrSerialization) ois.readObject();
		
		
		System.out.println("Student Name = " + output.stu_name);
        System.out.println("Student RollNo = " + output.stu_rollno);
        System.out.println("Student Password = " + output.stu_password);
        System.out.println("Student Email= " + output.stu_email);  
        System.out.println("Student Address = " + output.stu_address);
		
	}

}
