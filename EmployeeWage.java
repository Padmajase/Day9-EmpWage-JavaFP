/** calculating Wages for multiple company**/

import java.util.Scanner;
import java.util.Random;

class EmployeeWage 
{
	public static void main(String args[])
	{
		System.out.println("Welcome !");

		System.out.println("Enter the wagePerHour, workingHour, workingDays of compony for which  u want to calculate the wage");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		Wage.calculateEmpWage(a, b, c);
	}
}
class Wage
{
	static void calculateEmpWage(int wagePerHour, int workingHour, int workingDays)
	{	
		int employeeWage = (wagePerHour * workingHour * workingDays);
		System.out.println(" Employee Wage for the company = " + employeeWage);
		
	}	
}
