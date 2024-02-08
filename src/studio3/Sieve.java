package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How big do you want the array?");
		int arraySize = (int) scan.nextInt();
		boolean [] primeNumbers = new boolean [arraySize +1];
		
		for (int i = 2; i<=arraySize; i++ )
		{
		if (primeNumbers[i] == true)
		{
			for (int j = (int) Math.pow(i,2); j<= (int) Math.pow(arraySize,2); j = j+i)
			{
				 primeNumbers[j] = false;
			}
			
		
				
		}
		System.out.println(primeNumbers[i]==true);
		}
		
		
	}


}
