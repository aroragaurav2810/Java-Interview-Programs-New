package studystuff_serialization_deseriailization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


// The term Deserialization here means the conversion from Stream of file to a Class Object
// This Class would run along with class SerializationOfObjectIntoStream because first we will
// serialize an object into a stream and then deserialize that stream into an object back. 
public class DeSerializationOfStreamIntoObject 

{
	
	public  Object deSerializationOfStream(String filename) throws Exception
	{
		// Step 1: FileInputStream is used to read the serialized content of rectangle class from the file serializableFile 
		FileInputStream fin = new FileInputStream(new File(filename));

		// Step 2: ObjectInputStream object is used convert stream into class object
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fin);

		// Step 3: Read the content of the stream and convert it into object using method readObject
		Object deserializeObject = objectInputStream.readObject();

		// Step 4: Close all the resources
		objectInputStream.close();
		fin.close();

		// return the deserialized object
		return deserializeObject;
	}
}

