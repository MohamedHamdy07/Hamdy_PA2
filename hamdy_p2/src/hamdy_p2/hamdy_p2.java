package hamdy_p2;
import java.text.DecimalFormat;
import java.util.*;

public class hamdy_p2 {
	public static void main(String[] args) {
	double weight = 0, kgweight = 0 , formula;
	double height = 0, mheight = 0 ;
	double BMI = 0;
	double BMI2 = 0;
	double BMI3 = 0;
	System.out.println("Press 1 to use the metric system and press 2 to use imperial.");
	Scanner scanner = new Scanner(System.in);
	formula = scanner.nextInt();
	
	if (formula == 1)
	{
		System.out.println("Please enter your weight in kilograms");
		kgweight = scanner.nextDouble();
		System.out.println("Please enter your height in meters");
		mheight = scanner.nextDouble();
		BMI = kgweight/(Math.pow(mheight, 2));
		
		
		
	}
	else if (formula == 2)
	{
		System.out.println("Please enter your weight in pounds");
		weight = scanner.nextDouble();
		System.out.println("Please enter your height in inches");
		height = scanner.nextDouble();
		BMI = (703 *weight)/(Math.pow(height, 2));
	}
	System.out.printf(" Your BMI is %.1f \n ", BMI );
	
	
	if(BMI < 18.5 )
	{
		System.out.println("Your BMI is considered: Underweight");
	}
	else if(BMI >= 18.5 && BMI <= 24.9 )
	{
		System.out.println("Your BMI is considered: Normal Weight");
	}
	else if(BMI >= 25 && BMI <= 29.9 )
	{
		System.out.println("Your BMI is considered: Overweight");
	}
	else if(BMI >= 30 )
	{
		System.out.println("Your BMI is considered: Obese");
	}
	}
}
