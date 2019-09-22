package hamdy_p3;

import java.util.Scanner;

public class hamdy_p3 {

	public static void main(String[] args) {
		String topics[] =  {"Guns", "Abortion", "Final Fantasy VII", "Public Education", "Soundcloud Rap" };
		double users = 0;
		double guns = 0, abortion = 0, ffvii = 0 , PE = 0, rap = 0;
		double nguns = 0, nabortion = 0, nffvii = 0 , nPE = 0, nrap = 0;
		int responses[][] = new int[5][10];
		double a1, a2, a3, a4, a5, temp;
		String more;
		String yes = "Y";
		String no = "N";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to begin the survey? (Y/N)");
		more = scanner.next();
		while(more.equals(yes)) 
		{
		users ++;
		System.out.printf("Welcome! You will see 5 topics listed in the poll. Please rate the importance of them on a scale of 1-10 with 1 being the least important and 10 being the most important \n");
		System.out.printf("Topic 1: %s\n", topics[0]);
		guns = scanner.nextInt();
		if(guns == 1)
		{
			responses[0][0]++;
			nguns = nguns + guns;
		}
		else if(guns == 2)
		{
			responses[0][1]++;
			nguns = nguns + guns;

		}
		else if(guns == 3)
		{
			responses[0][2]++;
			nguns = nguns + guns;

		}
		else if(guns == 4)
		{
			responses[0][3]++;
			nguns = nguns + guns;

		}
		else if(guns == 5)
		{
			responses[0][4]++;
			nguns = nguns + guns;

		}
		else if(guns == 6)
		{
			responses[0][5]++;
			nguns = nguns + guns;

		}
		else if(guns == 7)
		{
			responses[0][6]++;
			nguns = nguns + guns;

		}
		else if(guns == 8)
		{
			responses[0][7]++;
			nguns = nguns + guns;

		}
		else if(guns == 9)
		{
			responses[0][8]++;
			nguns = nguns + guns;

		}
		else if(guns == 10)
		{
			responses[0][9]++;
			nguns = nguns + guns;

		}
		
		System.out.printf("Topic 2: %s\n", topics[1]);
		abortion = scanner.nextInt();
		if(abortion == 1)
		{
			responses[1][0]++;
			nabortion = nabortion + abortion;
		}
		else if(abortion == 2)
		{
			responses[1][1]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 3)
		{
			responses[1][2]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 4)
		{
			responses[1][3]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 5)
		{
			responses[1][4]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 6)
		{
			responses[1][5]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 7)
		{
			responses[1][6]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 8)
		{
			responses[1][7]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 9)
		{
			responses[1][8]++;
			nabortion = nabortion + abortion;

		}
		else if(abortion == 10)
		{
			responses[1][9]++;
			nabortion = nabortion + abortion;

		}
		System.out.printf("Topic 3: %s\n", topics[2]);
		ffvii = scanner.nextInt();
		if(ffvii == 1)
		{
			responses[2][0]++;
			nffvii = nffvii + ffvii;
		}
		else if(ffvii == 2)
		{
			responses[2][1]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 3)
		{
			responses[2][2]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 4)
		{
			responses[2][3]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 5)
		{
			responses[2][4]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 6)
		{
			responses[2][5]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 7)
		{
			responses[2][6]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 8)
		{
			responses[2][7]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 9)
		{
			responses[2][8]++;
			nffvii = nffvii + ffvii;

		}
		else if(ffvii == 10)
		{
			responses[2][9]++;
			nffvii = nffvii + ffvii;

		}
		System.out.printf("Topic 4: %s\n", topics[3]);
		PE = scanner.nextInt();
		if(PE == 1)
		{
			responses[3][0]++;
			nPE = nPE +PE;
		}
		else if(PE == 2)
		{
			responses[3][1]++;
			nPE = nPE +PE;

		}
		else if(PE == 3)
		{
			responses[3][2]++;
			nPE = nPE +PE;

		}
		else if(PE == 4)
		{
			responses[3][3]++;
			nPE = nPE +PE;

		}
		else if(PE == 5)
		{
			responses[3][4]++;
			nPE = nPE +PE;

		}
		else if(PE == 6)
		{
			responses[3][5]++;
			nPE = nPE +PE;

		}
		else if(PE == 7)
		{
			responses[3][6]++;
			nPE = nPE +PE;

		}
		else if(PE == 8)
		{
			responses[3][7]++;
			nPE = nPE +PE;

		}
		else if(PE == 9)
		{
			responses[3][8]++;
			nPE = nPE +PE;

		}
		else if(PE == 10)
		{
			responses[3][9]++;
			nPE = nPE +PE;

		}
		System.out.printf("Topic 5: %s\n", topics[4]);
		rap = scanner.nextInt();
		if(rap == 1)
		{
			responses[4][0]++;
			nrap = nrap + rap;
		}
		else if(rap == 2)
		{
			responses[4][1]++;
			nrap = nrap + rap;

		}
		else if(rap == 3)
		{
			responses[4][2]++;
			nrap = nrap + rap;

		}
		else if(rap == 4)
		{
			responses[4][3]++;
			nrap = nrap + rap;

		}
		else if(rap == 5)
		{
			responses[4][4]++;
			nrap = nrap + rap;

		}
		else if(rap == 6)
		{
			responses[4][5]++;
			nrap = nrap + rap;

		}
		else if(rap == 7)
		{
			responses[4][6]++;
			nrap = nrap + rap;

		}
		else if(rap == 8)
		{
			responses[4][7]++;
			nrap = nrap + rap;

		}
		else if(rap == 9)
		{
			responses[4][8]++;
			nrap = nrap + rap;

		}
		else if(rap == 10)
		{
			responses[4][9]++;
			nrap = nrap + rap;

		}
		
		
		System.out.println("Are there more users that are going to complete the survey? (Y/N)");
		more = scanner.next(); 
		}
		a1 = nguns / users;
		a2 = nabortion / users;
		a3 = nffvii / users;
		a4 = nPE /users;
		a5 = nrap / users;
		System.out.printf("Thank you! Calculating results. \n");
		
		System.out.printf("Rating            | ");
		System.out.printf("1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | \n");

		System.out.printf("------------------------------------------------------------ \n");
		System.out.printf("Guns              | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d  | Average:  %f\n", responses[0][0],responses[0][1],responses[0][2],responses[0][3],responses[0][4],responses[0][5],responses[0][6],responses[0][7],responses[0][8],responses[0][9],a1);
		System.out.printf("------------------------------------------------------------ \n");
		System.out.printf("Abortion          | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d  | Average:  %f\n", responses[1][0],responses[1][1],responses[1][2],responses[1][3],responses[1][4],responses[1][5],responses[1][6],responses[1][7],responses[1][8],responses[1][9],a2);
		System.out.printf("------------------------------------------------------------ \n");
		System.out.printf("Final Fantasy VII | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d  | Average:  %f\n", responses[2][0],responses[2][1],responses[2][2],responses[2][3],responses[2][4],responses[2][5],responses[2][6],responses[2][7],responses[2][8],responses[2][9],a3);
		System.out.printf("------------------------------------------------------------ \n");
		System.out.printf("Public Education  | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d  | Average:  %f\n", responses[3][0],responses[3][1],responses[3][2],responses[3][3],responses[3][4],responses[3][5],responses[3][6],responses[3][7],responses[3][8],responses[3][9],a4);
		System.out.printf("------------------------------------------------------------ \n");
		System.out.printf("Soundcloud Rap    | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d  | Average:  %f\n", responses[4][0],responses[4][1],responses[4][2],responses[4][3],responses[4][4],responses[4][5],responses[4][6],responses[4][7],responses[4][8],responses[4][9],a5);
		
		if (a1 > a2 && a1 > a3 && a1 > a4 && a1 > a5)
		{
			System.out.printf("Your highest rated topic is %s at %f points", topics[0], a1);
		}
		if (a2 > a1 && a2 > a3 && a2 > a4 && a2 > a5)
		{
			System.out.printf("Your highest rated topic is %s at %f points", topics[1], a2);
		}
		if (a3 > a2 && a3 > a1 && a3 > a4 && a3 > a5)
		{
			System.out.printf("Your highest rated topic is %s at %f points", topics[2], a3);
		}
		if (a4 > a2 && a4 > a3 && a4 > a1 && a4 > a5)
		{
			System.out.printf("Your highest rated topic is %s at %f points", topics[3], a4);
		}
		if (a5 > a2 && a5 > a3 && a5 > a4 && a5 > a1)
		{
			System.out.printf("Your highest rated topic is %s at %f points", topics[4], a5);
		}
		if (a1 < a2 && a1 < a3 && a1 < a4 && a1 < a5)
		{
			System.out.printf("Your lowest rated topic is %s at %f points", topics[0], a1);
		}
		if (a2 < a1 && a2 < a3 && a2 < a4 && a2 < a5)
		{
			System.out.printf("Your lowest rated topic is %s at %f points", topics[1], a2);
		}
		if (a3 < a2 && a3 < a1 && a3 < a4 && a3 < a5)
		{
			System.out.printf("Your lowest rated topic is %s at %f points", topics[2], a3);
		}
		if (a4 < a2 && a4 < a3 && a4 < a1 && a4 < a5)
		{
			System.out.printf("Your lowest rated topic is %s at %f points \n", topics[3], a4);
		}
		if (a5 < a2 && a5 < a3 && a5 < a4 && a5 < a1)
		{
			System.out.printf("Your lowest rated topic is %s at %f points", topics[4], a5);
		}


	}
		
		
	
	
		
		
		
		
	}


