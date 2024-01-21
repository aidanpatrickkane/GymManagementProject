import java.util.Scanner;

public class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected String financials;
	
	public Person() {
		
	}
	
	public Person(String name, String phoneNumber, String emailAddress, String financials) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.financials = financials;
	}

	public String getName() {
		return name;
	}

	public void setName(Scanner scan) {
		System.out.println("Enter your full name: ");
		String name = scan.nextLine();
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Scanner scan) {
		System.out.println("Enter your phone number (one sequence of numbers w/o spaces): ");
	    String phoneNumber = scan.nextLine();
		while(true) {
			if(phoneNumber.length() == 10) {
	    this.phoneNumber = phoneNumber;
			break;
			}
			else {
				System.out.println("Please enter a valid phone number.");
				phoneNumber = scan.nextLine();
			}
		}
		}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Scanner scan) {
		while(true) {
			System.out.println("Enter your email address: ");
		    String emailAddress = scan.nextLine();
			if(emailAddress.contains("@") && emailAddress.contains(".")) {
				this.emailAddress = emailAddress;
				break;
			}
		}
	}
	
	public void setFinancials(Scanner scan) {
		while(true) {
		System.out.println("Please enter your credit card number (16 digits): ");
		String validNum = scan.nextLine();
		if(validNum.length() == 16) {
			financials = validNum;
			break;
		}
		else {
			System.out.println("Please input a valid credit card number.");
		}
		}
	}

	public String getFinancials() {
		return financials;
	}
	
}
