public class EmployeeWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmpWage( String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
	
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <=  maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IS_PART_TIME:
               empHrs = 4;
               break;
            case IS_FULL_TIME:
               empHrs = 8;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#:" + totalWorkingDays +"Company is "+ company + " Employee Hours: " + empHrs);
      }
      int totalEmpWage = totalEmpHrs * empRatePerHours;
      System.out.println("Total Employee Wage for Company is: "+ company +" is: "+ totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage( "Bridgelabz",20, 20, 100);
		computeEmpWage( "Java",12, 30, 200);
	}
}
