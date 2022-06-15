package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		List<Integer> ele= new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			ele.add(data[i]);					
		}
		System.out.println("The original List is:" + ele);
		// Arrange the array in ascending order
		Collections.sort(ele);
		System.out.println("The sorteds List is:" + ele);

		System.out.println("Second Largest Number is:" +ele.get(ele.size()-2));



	}

}


