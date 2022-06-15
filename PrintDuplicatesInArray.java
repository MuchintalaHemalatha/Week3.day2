package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> lst=new ArrayList<Integer>(); 
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		System.out.println(lst);
		// get the length of the array
		System.out.println("Array size is:"+ lst.size());
		// declare an int variable named count
		int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int j = 0; j < lst.size()-1; j++) {
			// assign 0 to count
			count=0;
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int k = j+1; k < lst.size(); k++) {
				// compare both the loop variables & check they're equal
				if(lst.get(j)==lst.get(k))
				{
					// increase the count if both the arrays are equal
					count=count+1;
				}
			}
			// Out of the inner loop, check and print the first array variable if count is more than 0
			if(count>0)
			{
				System.out.println("Duplicate values are:" +lst.get(j));
			}

		}

	}

}
