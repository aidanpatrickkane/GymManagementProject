
import java.util.Scanner;

public class Employee extends Person{
	private String payChoice;
	private String specialtyExercise;
	private String jobPosition;
	
	public Employee() {
		
	}
	
	public Employee(String name, String phoneNumber, String emailAddress, String financials, String payChoice, String specialtyExercise, String jobPosition) {
		super(name, phoneNumber, emailAddress, financials);
		this.payChoice = payChoice;
		this.specialtyExercise = specialtyExercise;
		this.jobPosition = jobPosition;
		
	}
	
	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getPayChoice() {
		return payChoice;
	}

	public String getSpecialtyExercise() {
		return specialtyExercise;
	}

	public void setSpecialtyExercise(String specialtyExercise) {
		
		this.specialtyExercise = specialtyExercise;
	}

	@Override
	public void setFinancials(Scanner scan) {
		super.setFinancials(scan);
		System.out.println("Please enter your preferred method of payment (\"1\" for Direct Deposit or \"2\" for Mailed Check): ");
		int oneOrTwo = scan.nextInt();
		if(oneOrTwo == 1) {
			payChoice = "Direct Deposit";
		}
		if(oneOrTwo == 2) {
			payChoice = "Mailed Check";
		}
	}

}
