package salarydemo;

public class StudentEmployee extends Employee {

	private int credit;
	private double hourlyWage;

	public int getCredit() {
		return this.credit;
	}

	/**
	 * 
	 * @param credit
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}

	/**
	 * 
	 * @param name
	 * @param wage
	 * @param credit
	 */
	public StudentEmployee(String name, double wage, int credit) {
		setName(name);
                hourlyWage = wage;
	}

	/**
	 * 
	 * @param hoursWorked
	 */
	public double weeklyPay(int hoursWorked) {
		// TODO - implement StudentEmployee.weeklyPay
		throw new UnsupportedOperationException();
	}

}