import java.util.Random;

class EmployeeWage {

	static int wagePerHr = 20; 
	static int workingHr = 8;
	static int dayPerMonth = 20;
	static int HrPerMonth = 20;
	static int totalWorkingHr  = 0 ;

	/** calculating wage till working hour reached for a month **/

	public static void main(String args[])
	{
		System.out.println("Welcome !");

		while( totalWorkingHr <= 100 && dayPerMonth <=20 ) {
			Random rand = new Random();
			int isEmployee = rand.nextInt(3);	
			
			switch (isEmployee) {
			case 1 :
			{
				System.out.println("Employee is full time Present");
				int wage1 = (wagePerHr * workingHr );
				System.out.println("Daily full time Employee Wage = " + wage1);
			}
			break;
			case 2 :
			{
				System.out.println("Employee is part time Present");
				int wage2 = (wagePerHr * workingHr );
				System.out.println("Daily part time Employee Wage = " + wage2);
			}	
			break;
			case 0 :
			{
				System.out.println("Employee is Absent");
				System.out.println("Daily Employee Wage = 0 " );
			}
			break;
			default :
			System.out.println("Invalid");
			break;

			} 
			totalWorkingHr = totalWorkingHr + workingHr ;
			System.out.println(totalWorkingHr );
		}
	}
}
