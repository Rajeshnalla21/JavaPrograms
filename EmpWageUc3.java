public class EmpWageUc3 {
	public static void main(String[] args) {
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee Wage Computation");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_PART_TIME)
			empHrs = 8;
		else if (empCheck == IS_FULL_TIME)
         empHrs = 12;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee Wage: " + empWage);
	}
}
