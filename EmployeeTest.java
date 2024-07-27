import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		System.out.print("Welcome To My Program!!!\n");
		System.out.print("The purpose of this program is to simply practice creating constructors, instances and other conceprts required to have a successful java program!");
		System.out.print("\n\n\n");//Creating space for Title
		//Creating scanner for user input
		Scanner input = new Scanner(System.in);
		//Variables for Users
		String fName, lName;
		double salary;
		//Prompt for user inputs
		System.out.print("Enter the first name of employee 1: ");
		fName = input.nextLine();
		System.out.print("Enter the last name of employee 1: ");
		lName = input.nextLine();
		System.out.print("Enter the monthly salary of employee 1: ");
		salary = input.nextDouble(); 
		Employee emp1 = new Employee(fName, lName, salary);//creating employee object 1
		input.nextLine();
		System.out.print("\n\n");//creating space between employee 1 and 2
		System.out.print("Enter the first name of employee 2: ");
		fName = input.nextLine();
		System.out.print("Enter the last name of employee 2: ");
		lName = input.nextLine();
		System.out.print("Enter the monthly salary of employee 2: ");
		salary = input.nextDouble();
		Employee emp2 = new Employee(fName, lName, salary);
		System.out.print("\n\n");
		//printing output
		System.out.printf("Employee One's name: %s, %s",emp1.getfName(),emp1.getlName());
		System.out.printf("\nEmployee One's yearly salary: $%,.2f", emp1.getSalary());
		System.out.printf("%nEmployee two's name: %s, %s%n",emp2.getfName(),emp2.getlName());
		System.out.printf("Employee two's yearly salary: $%,.2f", emp2.getSalary());
		input.close();
	}
}
