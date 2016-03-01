package base;

import java.util.Scanner;

public class TuitionBill {
	/** Initial Tuition */
	private static double initT; 
	/** Percent Increase */
	private static double pIncr; 
	private static double APR; 
	private static double term; 

	/** Calculates the Total Amount of Tuition Needed to Pay */
	public static double totalt(double initT, double pIncr) {
		double cost = initT;
		double total = initT;
		for (int i = 1; i < 4; i++) {
			cost = (cost * ((pIncr / 100) + 1));
			total += cost;
		}
		return total;
	}

	/** Uses Compound Interest Formula to Calculate Monthly Pay */
	public static double monthlypay(double total, double APR, double term){
		double pay = total * Math.pow((1+((APR/100)/12)), (12*term));
		double monthpay = pay/(12*term);
		return monthpay;
	}
	
	/** Requires Input to Calculate Final Cost and Monthly Payment */
	public static void main(String[] args) {
		Scanner bill = new Scanner(System.in);
		System.out.print("Insert Initual Tuition Cost: ");
		initT = bill.nextDouble();
		System.out.print("Insert Percentage Increase for Tuition: ");
		pIncr = bill.nextDouble();
		System.out.print("Insert Repayment APR: ");
		APR = bill.nextDouble();
		System.out.print("Insert Term: ");
		term = bill.nextDouble();
		bill.close();

		System.out.println();
		double total = TuitionBill.totalt(initT, pIncr);
		double monthpay = TuitionBill.monthlypay(total, APR, term);
		System.out.printf("Total Tuition: $%.2f %n", total);
		System.out.printf("Monthly Payment: $%.2f", monthpay);
	}

}
