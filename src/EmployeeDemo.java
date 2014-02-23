// Class to demonstrate exception throwing from Employee & ProductionWorker classes 
// This demo will not take user input; it will simply create several ProductionWorker instances and validate functionality. 
public class EmployeeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductionWorker tempWorker;
		String name;
		String employeeNumber;
		String hireDate;
		int shift;
		double payRate;
		
		// first example - valid ProductionWorker example
		name = "Joe";
		employeeNumber = "123-B";
		hireDate = "Jan 5, 2008";
		shift = 1;
		payRate = 6.00;
		
		System.out.println("Creating ProductionWorker with values...");
		System.out.println("Name: " + name);
		System.out.println("Employee Number: " + employeeNumber);
		System.out.println("Hire Date: " + hireDate);
		System.out.println("Shift: " + shift);
		System.out.println("Pay Rate: " + payRate);
		
		try {
		tempWorker = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
		
		// demo toString method
		System.out.println("Object created successfully!!!");
		System.out.println(tempWorker.toString());
		}
		
		catch (InvalidEmployeeNumber e)
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidShift e)
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}
		
		// second example - invalid employee number
		name = "Jim";
		employeeNumber = "123-X";
		hireDate = "Jan 6, 2008";
		shift = 2;
		payRate = 6.00;
		
		System.out.println("Creating ProductionWorker with values...");
		System.out.println("Name: " + name);
		System.out.println("Employee Number: " + employeeNumber);
		System.out.println("Hire Date: " + hireDate);
		System.out.println("Shift: " + shift);
		System.out.println("Pay Rate: " + payRate);
		
		try {
		tempWorker = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
		
		// demo toString method
		System.out.println("Object created successfully!!!");
		System.out.println(tempWorker.toString());
		}
		
		catch (InvalidEmployeeNumber e)
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidShift e)
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}

		// third example - invalid shift
				name = "Jorge";
				employeeNumber = "123-C";
				hireDate = "Jan 7, 2008";
				shift = 3;
				payRate = 6.00;
				
				System.out.println("Creating ProductionWorker with values...");
				System.out.println("Name: " + name);
				System.out.println("Employee Number: " + employeeNumber);
				System.out.println("Hire Date: " + hireDate);
				System.out.println("Shift: " + shift);
				System.out.println("Pay Rate: " + payRate);
				
				try {
				tempWorker = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
				
				// demo toString method
				System.out.println("Object created successfully!!!");
				System.out.println(tempWorker.toString());
				}
				
				catch (InvalidEmployeeNumber e)
				{
					System.out.println(e.getMessage());
				}
				catch (InvalidShift e)
				{
					System.out.println(e.getMessage());
				}
				catch (InvalidPayRate e)
				{
					System.out.println(e.getMessage());
				}
				
				// fourth example - invalid employee number
				name = "Jarred";
				employeeNumber = "123-L";
				hireDate = "Jan 9, 2008";
				shift = 2;
				payRate = -6.00;
				
				System.out.println("Creating ProductionWorker with values...");
				System.out.println("Name: " + name);
				System.out.println("Employee Number: " + employeeNumber);
				System.out.println("Hire Date: " + hireDate);
				System.out.println("Shift: " + shift);
				System.out.println("Pay Rate: " + payRate);
				
				try {
				tempWorker = new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);
				
				// demo toString method
				System.out.println("Object created successfully!!!");
				System.out.println(tempWorker.toString());
				}
				
				catch (InvalidEmployeeNumber e)
				{
					System.out.println(e.getMessage());
				}
				catch (InvalidShift e)
				{
					System.out.println(e.getMessage());
				}
				catch (InvalidPayRate e)
				{
					System.out.println(e.getMessage());
				}
	}

}
