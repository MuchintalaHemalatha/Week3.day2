package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

import com.github.dockerjava.api.model.Driver;

public class RemoveDuplicates {

	public static void main(String[] args) {



		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";	
		String op=" ";
		// b) Initialize an integer variable as count	 
		int count=1;
		// c) Split the String into array(Here to char) and iterate over it 
		String[] split = text.split(" ");

		Set<String> unique= new LinkedHashSet<String>();
		// d) Initialize another loop to check whether the word is there in the array

		for (String str: split) {
			unique.add(str);

		}
		System.out.println(unique);
		//System.out.println(unique);
		//if(unique.add(split[i]))
		//{
		count=count+1;
		// e) if it is available then increase and count by 1.
		if(count>1) {

		}

		// f) if the count > 1 then replace the word as "" 

		// g) Displaying the String without duplicate words	
		//System.out.println(split[i].replace("java",""));
	}	
}
















