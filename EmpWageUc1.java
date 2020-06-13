public class EmpWageUc1 {
	public static void main(String[] args) {
		int isPresent = 1;
		System.out.println("Welcome to Employee Wage Computation");
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
	}
}
