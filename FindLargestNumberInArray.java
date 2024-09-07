package Week3.Homeassignment;

import java.util.ArrayList;
import java.util.Collections;


public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr={3, 2, 11, 4, 6, 7};
		//converting array into arraylist and order with ascending
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (Integer num : arr) {
			list.add(num);
		}
		Collections.sort(list);
		System.out.println("Ascending order number is:" +list);
		//To find second largest number from the arraylist
		int secondLargest=list.get(list.size()-2);
		System.out.println("Second Largest Number Is:"+secondLargest);

	}

}