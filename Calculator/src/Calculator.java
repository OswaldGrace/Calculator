import java.util.Scanner;

public class Calculator
{

		public static void main(String[] args)
		{
		
		System.out.println("Choose 1 number");
		Scanner userInput = new Scanner(System.in);
		double a = userInput.nextDouble();
		System.out.println("Choose a second number");
		Scanner userInput2 = new Scanner(System.in);
		double b = userInput2.nextDouble();
		
		System.out.println("What would you like to do?");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		Scanner userInput3 = new Scanner(System.in);
		int operation = userInput3.nextInt();
		
		
		if(operation==1)
			{
				System.out.println("Your answer is " +add(a,b) + "");
			}
		else if(operation==2)
			{
				System.out.println("Your answer is " + subtract(a,b) + "");
			}
		else if(operation==3)
			{
				System.out.println("Your answer is " + multiply(a,b) + "");
			}
		else if(operation==4)
			{
				System.out.println("Your answer is " + divide(a,b) + "");
			}
			
		}
			public static double add(double a, double b)
			{
				return a + b;
			}
			public static double subtract(double a, double b)
			{
				return a - b;
			}
			public static double multiply(double a, double b)
			{
				return a * b;
			}
			public static double divide(double a, double b)
			{
				return a / b;
			}
		
		}
	

