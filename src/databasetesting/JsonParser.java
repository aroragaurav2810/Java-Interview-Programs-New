package databasetesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.TypeFactory;

/**
 * A class for converting JSON file list of objects using Jackson library
 * 
 * @author ashish.mohanty
 * @version 1.0
 * @since 2016-05-23
 *
 */

public class JsonParser {
	
	private static Logger log = Logger.getLogger(JsonParser.class);
	
	public File json;
	public JsonParser(String filename)
	{
		this.json = new File(filename);
	}
	
	/**
	 * This method converts a JSON to a list of objects (The passed list class)
	 * Works for nested JSON as well
	 * To ignore any property in JSON use the "@JsonIgnoreProperties({"key separated by ,"})"
	 * @param json -- File from a local path location
	 * @param listClass -- The POCO class which contains the variables with same name of the Keys in JSON
	 * POCO Class can contain object of different Classes
	 * @return List of Objects of the POCO class passed as an argument
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public <T> List<T> Jsontojavalist(File json,Class<T> listClass) throws InstantiationException, IllegalAccessException, JsonParseException, JsonMappingException, IOException
	{
		
/*
		ObjectMapper mapper = new ObjectMapper();
		TypeFactory typeFactory = mapper.getTypeFactory();
		CollectionType collectionType = typeFactory.constructCollectionType(List.class, listClass);
		log.info("List created");
		return mapper.readValue(json, collectionType);*/
		return null;
	}
	
	
	
}
