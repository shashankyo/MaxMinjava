package maxmin;

import java.util.Scanner;

public class MaxndMin {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int length= scan.nextInt();
	int arr[] =  new int[length];
	System.out.println("Enter the array elements:");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i] = scan.nextInt();
	}
	int min = arr[0];
	int max =arr[0];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		if (max < arr[i])
		{
			max = arr[i];

		}
		
		if (min > arr[i])
		{
			min = arr[i];

		}
		
	}
	
	System.out.println("Max is;"+max);
	System.out.println("Min is;"+min);
	}
}
