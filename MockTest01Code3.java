//Write a java program to calculate the average of a 
//list of numbers using a do while loop

package in.ineuron.com;

import java.util.Scanner;

public class MockTest01Code3 {

	public static void main(String[] args) {
		int i=0;
		double sum=0;
		double average=0;
		
		System.out.println("Enter the size of the list");
		Scanner sc =new Scanner (System.in);
		int size= sc.nextInt();
		int[] arr =new int[size];
		System.out.println("Enter the elments of the list");
		do {
			arr[i]=sc.nextInt();
			sum+=arr[i];	
			i++;
		}while(i<size);
		
		average=sum/size;
		System.out.println("average is: "+average);
		
	}

}
