
public class ProductionWorker extends Employee {
	
	//public static final int DAY_SHIFT = 1;
	//public static final int NIGHT_SHIFT = 2;
	private int shift;       
	private double payRate;   
	
	public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double payRate) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber
		{
			super(name, employeeNumber, hireDate);
			
			if (shift != 1 && shift != 2)
				throw new InvalidShift();
			
			if (payRate < 0)
				throw new InvalidPayRate();
			
			this.shift = shift;
			this.payRate = payRate;
		}
	
	public void setShift(int shift) throws InvalidShift
		{
			if (shift != 1 && shift != 2)
				throw new InvalidShift();
		
			this.shift = shift;
		}
	
	public void setPayRate(double payRate) throws InvalidPayRate
		{
			if (payRate < 0)
				throw new InvalidPayRate();
		
			this.payRate = payRate;
		}

	public int getShift()
		{
			return shift;
		}
	
	public double getPayRate()
		{
			return payRate;
		}
	
	public String toString()
	{
		String str = super.toString() + " Shift: " + shift + " Hourly Pay Rate: " + payRate;
		
		return str;
	}
}
