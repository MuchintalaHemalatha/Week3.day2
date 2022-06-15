package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};		
		// Remove the duplicates using Set
		Set<Integer> set=new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		//Make sure the set is in the ascending order(Obviously it wll as we used Tree Set)
		System.out.println("Assending Order set is:" +set);
		//Converting set to list
		List<Integer> lst=new ArrayList<Integer>(set);
		//Iterate from the starting number and verify the next number is + 1
		for (int i = 0; i < lst.size(); i++) {
			// If did not match, that is the number
			if(lst.get(i)!=i+1)
			{
				System.out.println("The Missing Number is :" +(i+1));
				break;
			}
		}




		/*for (Integer missingNumber : set) {

			if(!(missingNumber==(missingNumber+1)))
			{
				System.out.println("The Missing Number is:" +missingNumber );
				break;
			}*/

	}
}



