package Week3.Homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr={1, 2, 3, 4, 10, 6, 8};
		//Convert Array to ArrayList
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//Sorting in ascending order
        for (int num : arr) {
            numberList.add(num);
        }
        Collections.sort(numberList);
        
        System.out.println("Sorted List Is: " + numberList);
        System.out.println("Missing numbers:");
        //Finding if there is any gap between array list
        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);
        
            if (current + 1 != next) {
                for (int j = current + 1; j < next; j++) {
                    
                    System.out.println(j);
                }
            }
        }

	}

}
