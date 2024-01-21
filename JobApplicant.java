import java.util.Scanner;
import java.util.HashMap;

public class JobApplicant extends Person {
	private String desiredPosition;
	protected HashMap<String, String> questionResponses = new HashMap<>();
	private String payChoice;
	private String specialty;
	
	public JobApplicant() {
		
	}
	
	public JobApplicant(String name, String phoneNumber, String emailAddress, String financials, String payChoice, String desiredPosition, HashMap<String, String> questionResponses, String specialty) {
        super(name, phoneNumber, emailAddress, financials);
        this.payChoice = payChoice;
        this.desiredPosition = desiredPosition;
        this.questionResponses = questionResponses;
        this.specialty = specialty;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(Scanner scan, JobApplicant dude) {
    	System.out.println("Enter your desired position (1 for " + GymManagement.jobPositions[0] + ", 2 for " + GymManagement.jobPositions[1] + ")");
        int positionChoice = scan.nextInt();
        scan.nextLine();
         
         while (positionChoice != 1 && positionChoice != 2) {
             System.out.println("Make sure your number is 1 or 2");
             System.out.println("Enter your desired position (1 for Personal Trainer, 2 for Receptionist): ");
             positionChoice = scan.nextInt();
             scan.nextLine();
         }
         
         this.desiredPosition = GymManagement.jobPositions[positionChoice - 1];
         
         if (desiredPosition.equalsIgnoreCase("Receptionist") && GymManagement.receptionistCount >= 3) {
             System.out.println("We already have 3 receptionists, but if you can solve this riddle, you can take one of their places.");
             System.out.println("Riddle: What has many keys but can't open a single lock?");
             String riddleAnswer = scan.nextLine();
             if (GymManagement.checkRiddleAnswer(riddleAnswer)) {
                 System.out.println("Congratulations! You solved the riddle and took a receptionist's place. Call 555-6789 for the next steps.");
                 System.out.println("Welcome to The Dawg Pound!");
                 GymManagement.receptionistCount--;
                 GymManagement.hireJobApplicant(dude);
                 GymManagement.receptionistCount++;
                 return;
             } else {
                 System.out.println("Sorry, you didn't solve the riddle. Better luck next time, Lil' Dawg. We'll let you know if any positions open up.");
                 return;
             }
         }
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Scanner scan) {
        System.out.println("To efficiently match trainers with incoming members, we ensure they excel in either \"Cardio\", \"Strength\", or \"HIIT\". Enter your specialty of those three options.");
        String specialty = scan.nextLine();
        while(!specialty.equalsIgnoreCase("Cardio") && !specialty.equalsIgnoreCase("Strength") && !specialty.equalsIgnoreCase("HIIT")) {
        	System.out.println("Check your spelling! Make sure your answer is either cardio, strength, or HIIT.");
        	specialty = scan.nextLine();
        	if(specialty.equalsIgnoreCase("cardio") || specialty.equalsIgnoreCase("strength") || specialty.equalsIgnoreCase("HIIT")) {
                this.specialty = specialty;
                break;
                }
        }
    }

    public HashMap<String, String> getQuestionResponses() {
        return questionResponses;
    }

    public void setQuestionResponses(HashMap<String, String> questionResponses, Scanner scan, JobApplicant jobApplicant) {
        System.out.println("Now time for the real questions.");
        System.out.println("Question 1: What experience do you have working in the fitness industry?");
        String q1 = "What experience do you have working in the fitness industry?";
        questionResponses.put(q1, scan.nextLine());
        System.out.println("Question 2: What sets you apart from other applicants?");
        String q2 = "What sets you apart from other applicants?";
        questionResponses.put(q2, scan.nextLine());
        System.out.println("Question 3: Which SpongeBob character are you most similar to?");
        String q3 = "Which SpongeBob character are you most similar to?";
        questionResponses.put(q3, scan.nextLine());
        if(questionResponses.containsValue("Patrick") || questionResponses.containsValue("patrick")) {
        	System.out.println("Perfect answer! You're hired!");
        	GymManagement.hireJobApplicant(jobApplicant);
        }        
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
    
    public String getPayChoice() {
		return payChoice;
	}
    
    @Override
    public String getFinancials() {
    	return financials;
    }
    public void printInfo() {
    	System.out.println("Name: " + name);
    	System.out.println("Phone Number: " + phoneNumber);
    	System.out.println("Email Address: " + emailAddress);
    	System.out.println("Last 4 Digits of Credit Card: " + financials.substring(12));
    	System.out.println("Payment Choice: " + payChoice);
    	System.out.println("Position Applied For: " + desiredPosition);
    	System.out.println("Question Responses: ");
    	for (String key : questionResponses.keySet()) {
            System.out.println(key + ": " + questionResponses.get(key));
        }

        System.out.println();
    }
}
