package studystuff_reflection_and_generic_enum_database;

/**
 * This is a stencil class to reflect any class and get variable names and data types in a list.
 * @author ashish.mohanty
 * @version 1.0
 * @Since 2016-05-23
 */
public class FieldNameTypeClass {
	
	public String Name;
	public Object Type;
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
	
	public Object getType() {
		return Type;
	}
	public void setType(Object type) {
		Type = type;
	}

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
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
		FieldNameTypeClass other = (FieldNameTypeClass) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FieldsNames [Name=" + Name + ", Type=" + Type + "]";
	}
	
}
