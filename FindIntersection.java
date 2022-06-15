package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		//a) Declare An array for {3,2,11,4,6,7};
		Integer arr1[]={3,2,11,4,6,7};

		List<Integer> a1=new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			a1.add(arr1[i]);		
		}
		System.out.println(a1);

		//* b) Declare another array for {1,2,8,4,9,7};
		/*(One way of converting array to list is as below
		List<Integer> a2=new ArrayList<Integer>(Arrays.asList(arr2));	*/
		Integer arr2[]={1,2,8,4,9,7};
		List<Integer> a2=new ArrayList<Integer>();
		for (int j = 0; j < arr2.length; j++) 
		{
			a2.add(arr2[j]);			
		}
		System.out.println(a2);
	
		// c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) {
			// d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr2.length; j++) {
				// e) Compare Both the arrays using a condition statement
				if(arr1[i]==arr2[j])
					// *  f) Print the first array (should match item in both arrays)
					System.out.println(arr1[i]);
			}
		}
	}

}







