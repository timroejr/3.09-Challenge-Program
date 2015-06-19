/**
 * 3.09 Challenge Program
 * @author timothyroejr
 * @version 6/17/15
 */

import java.util.Scanner;
public class Fines {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name (Last, First) with your Social Security Number: ");
		String lastName = in.next();
		String firstName = in.next();
		String SSN = in.nextLine();
		System.out.print("Title of Book: ");
		String book = in.nextLine();
		System.out.print("Date Checked Out (mm/dd/yyyy): ");
		String date = in.nextLine();
		System.out.print("Days Late: ");
		String daysLate = in.next();
		int daysLateParsed = Integer.parseInt(daysLate);
		System.out.print("Daily Fine: $");
		String dailyFine = in.next();
		double fine = Double.parseDouble(dailyFine);
		System.out.println();
		System.out.println();
		System.out.println();
		String account = lastName + firstName.substring(0,3) + SSN.substring(8);
		String revisedDate = date.replace("/", "-");
		double fineTotal = fine * daysLateParsed;
		System.out.println("To: " + lastName + firstName + "\t\t" + "Account: " + account);
		System.out.println("From: CSA");
		System.out.println("Subject: OVERDUE NOTICE");
		System.out.println("=================================================");
		System.out.println("\"" + book + "\"" + "was checked out on: " + revisedDate);
		System.out.println("The Book is Currently " + daysLate + " day(s) late.");
		System.out.println("Your fine has accumulated to: $" + fineTotal);
	}

}
