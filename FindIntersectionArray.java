package Week3.Homeassignment;

import java.util.ArrayList;

public class FindIntersectionArray {

	public static void main(String[] args) {
		//Initializing Array
		 int[] arr1 = {3, 2, 11, 4, 6, 7};
	     int[] arr2 = {1, 2, 8, 4, 9, 7};
	     //Convert Array into ArrayList
	     ArrayList<Integer> commonNumbers = new ArrayList<Integer>();
	     //Comparing both elements and find equals
	     for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    // Add the equal element to the list
	                    commonNumbers.add(arr1[i]);
	                }
	            }
	        }
	     //Print the equal values from both array
	     if (commonNumbers.isEmpty()) {
	            System.out.println("No common elements found.");
	        } else {
	            System.out.println("Common elements: " + commonNumbers);
	        }
          

	}

}
