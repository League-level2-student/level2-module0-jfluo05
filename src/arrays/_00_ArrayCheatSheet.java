   package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	
	public static void main(String[] args) {
		Random r= new Random();
		int smallestNum=30;
		int largestNum=0;
		//1. make an array of 5 Strings
		String[] names= {"Jordan", "Jessica","Jean","Jackie","Jade"};
		names= new String[5];
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="Jurusalem";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] ages;
		ages= new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i= 0; i<ages.length; i++) {
			 ages[i] =r.nextInt(10000)+1;
		}
		//8. without printing the entire array, print only the smallest number in the array
		smallestNum=10003;
		for(int i= 0; i<ages.length; i++) {
			System.out.println(ages[i]);
			if(smallestNum>ages[i]) {
			smallestNum=ages[i];
			}
		}
		System.out.println("smallest= "+smallestNum);
		
		//9 print the entire array to see if step 8 was correct
		
		
		//10. print the largest number in the array.
		largestNum=0;
		for(int i= 0; i<ages.length; i++) {
			System.out.println(ages[i]);
			if(largestNum<ages[i]) {
				largestNum=ages[i];
			}
		}
	}
}
