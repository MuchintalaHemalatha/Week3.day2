package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// Here is the input
		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer> mis=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mis.add(arr[i]);
		} 
		System.out.println("Original List is: "+ mis);
		// Sort the array	
		Collections.sort(mis);
		System.out.println("Sorted list is: "+ mis);	

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < mis.size(); i++) {
			// check if the iterator variable is not equal to the array values respectively
			if(mis.get(i)!=i+1)
			{
				// print the number
				System.out.println("Missing Element is:" +(i+1));
				// once printed break the iteration
				break;
			}
		}
	}

}
