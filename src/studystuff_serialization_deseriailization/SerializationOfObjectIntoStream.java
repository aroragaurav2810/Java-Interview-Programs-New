package studystuff_serialization_deseriailization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// The term Serialization here means the conversion from Class object to Stream on file
// This Class would run along with class DeSerializationOfStreamIntoObject because first we will
// serialize an object into a stream and then deserialize that stream into an object back.
public class SerializationOfObjectIntoStream 

{	
	
	
	public  void serializationOfObject(Rectangle classObject, String filename ) throws Exception
	{
		File file=new File(System.getProperty("user.dir")+"//"+filename);
		// FileOutputStream object is used to write straem/data in a file
		FileOutputStream fout=new FileOutputStream(file);
		// ObjectOutputStream object is used convert class object into stream using method writeObject 
		ObjectOutputStream objectstream=new ObjectOutputStream(fout);
		objectstream.writeObject(classObject);
		objectstream.close();
		fout.close();
		
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) throws Exception 
	
	{
		Rectangle rect=new Rectangle(18,20);
		
		SerializationOfObjectIntoStream serializedobj=new SerializationOfObjectIntoStream();
		serializedobj.serializationOfObject(rect,"serializableFile");
		
		DeSerializationOfStreamIntoObject deserializedobj=new DeSerializationOfStreamIntoObject();
		Rectangle obj=(Rectangle) deserializedobj.deSerializationOfStream("serializableFile");
		System.out.println("Rect area is " + obj.area());
	}

}


class Rectangle implements Serializable
{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	public double area()
	{
		int area=length*breadth;
		return area;
	}
	
	
	
}