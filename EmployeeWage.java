// Adding Part time Employee & Wage 

import java.util.Random;

class EmployeeWage {

	static int wagePerHr = 20;
	static int fullTimeHr = 8;
	static int partTimeHr = 8;

	public static void main(String args[]) {

	System.out.println("Welcome !");

	Random rand = new Random();
	int isEmployee = rand.nextInt(3);	
	//System.out.println(isEmployee);

	if(isEmployee == 1)
	{
		System.out.println("Employee is full time Present");
		System.out.println("Daily full time Employee Wage = " +(wagePerHr * fullTimeHr));
		
	}
	else if(isEmployee == 2)
	{
		System.out.println("Employee is part time Present");
		System.out.println("Daily part time Employee Wage = " +(wagePerHr * partTimeHr));
		
	}
	else
	{
		System.out.println("Employee is Absent");
		System.out.println("Daily Employee Wage = 0 " );
	}

	}
}
