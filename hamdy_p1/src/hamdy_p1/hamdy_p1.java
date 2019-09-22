package hamdy_p1;

import java.util.Scanner;

public class p1 {
	static int encryptMessage(int num)
	{
		
		int first, second, third, fourth, efirst, esecond, ethird, efourth;
		first = num / 1000 % 10;
		second = num / 100 % 10;
		third = num / 10 % 10;
		fourth = num % 10;
		
		efirst = (first + 7) % 10;
		esecond = (second + 7) % 10;
		ethird = (third + 7) % 10;
		efourth = (fourth + 7) % 10;
		String firstdig = Integer.toString(efirst);
		String seconddig = Integer.toString(esecond);
		String thirddig = Integer.toString(ethird);
		String fourthdig = Integer.toString(efourth);
		String combo = thirddig + fourthdig + firstdig + seconddig;
		int result = Integer.parseInt(combo);
		

		return result;
		
			
	}
	
	static int decryptMessage(int num)
	{
		int first, second, third, fourth, dfirst, dsecond, dthird, dfourth;
		
		first = num / 1000 % 10;
		second = num / 100 % 10;
		third = num / 10 % 10;
		fourth = num % 10;
		
		dfirst = (first + 3) % 10;
		dsecond = (second + 3) % 10;
		dthird = (third + 3) % 10;
		dfourth = (fourth + 3) % 10;
		String firstdig = Integer.toString(dfirst);
		String seconddig = Integer.toString(dsecond);
		String thirddig = Integer.toString(dthird);
		String fourthdig = Integer.toString(dfourth);
		String combo = thirddig + fourthdig + firstdig + seconddig;
		int result = Integer.parseInt(combo);
		
		
		
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please input message");
		int num1 = scanner1.nextInt();
		int message = encryptMessage(num1);
		System.out.println("Beep boop bop encrypting");
		System.out.println("Your encrypted message is: " + encryptMessage(num1));
		System.out.println("Would you like to decrypt the message? Enter Y for Yes and N for No");
		String answer = scanner1.next();
		if (answer.contentEquals("y") || answer.contentEquals("Y"))
		{
			System.out.println("Your decrtyped message is: " + decryptMessage(message));

		}
		else if (answer.contentEquals("n") || answer.contentEquals("N"))
		{
			System.out.println("Beep boop bop beep beep have a nice day");
		}
		else if (answer.contentEquals("y") == false && answer.contentEquals("Y") == false && answer.contentEquals("n") == false && answer.contentEquals("N") == false)
		{
			System.out.println("Bloop invalid entry :( have a nice day :(");
		}
		
		scanner1.close();
}
	}