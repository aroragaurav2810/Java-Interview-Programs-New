package studystuff_generics;

import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.generic.AALOAD;

public class GenericMethodWithClassAsParameter {

	
	 public <T> GenericMethodWithClassAsParameter(Class<T> jobclass)
	 {
		System.out.println("Generic Method With Class As Parameter"); 
	 }
	 

	 public List<String> getDealerPricesByInstrument(List<String> dealerPrice, long instrument)
		{
			List<String> dprice= new ArrayList<String>();
			dealerPrice.stream().filter(dp -> dp.equals(null)).forEach(dp-> dprice.add(dp));
			return new ArrayList<>();
		}
		
	 
	 
	   public static void main(String args[]) 
	   {
	   
		   GenericMethodWithClassAsParameter obj=new GenericMethodWithClassAsParameter(GenericMethodWithClassAsParameter.class);
		   
		   System.out.println(obj.getDealerPricesByInstrument(new ArrayList<>(), 75666));
		   
	   }
}
