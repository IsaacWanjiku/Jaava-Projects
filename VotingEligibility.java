package hello;

import java.util.Scanner;
public class VotingEligibility{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	int age =0;
	System.out.print("Enter the Age: ");
age = input.nextInt();
int res = age >= 18?1:0;
switch (res)
{
case 0:
      System.out.printf("You are Not Eligible for voting...");
			break ;
case 1:
	 System.out.printf("You are Eligible for voting...");
			}
    	   
	}

}

