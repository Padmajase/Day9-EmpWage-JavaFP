import java.util.Random;

class EmployeeWage {
	public static void main(String args[]) {

	System.out.println("Welcome !");

	Random rand = new Random();
	int isEmployee = rand.nextInt(2);	
	System.out.println(isEmployee);

	if(isEmployee == 1)
	{
		System.out.println("Employee is Present");
	}
	else
	{
		System.out.println("Employee is Absent");
	}

	}
}
