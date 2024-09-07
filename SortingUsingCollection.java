package Week3.Homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Reverse the given collection of String elements

public class SortingUsingCollection {
	
	    public static void main(String[] args) {
	    	//declaring Array in string
		String[] office= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//String Object to Initialize the list
		List<String> officelist=new ArrayList<String>();
		//adding given array as list
		officelist.addAll(Arrays.asList(office));
		//Sort the list with ascending using collections
		Collections.sort(officelist);
		//reverse the list using collection
		Collections.reverse(officelist);
		//Enhanced for loop to iterlate the values from list
		for (String off : officelist) {
			System.out.println(off);
		}
		
		
	}

}
