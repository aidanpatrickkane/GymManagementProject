import java.util.Scanner;

public class Member extends Person {
	private static int memberID = 445;
	private int id;
	private String favoriteExercise;
	private String fitnessGoal;
	
	
	public Member() {
		memberID++;
	}
	
	public Member(String name, String phoneNumber, String emailAddress, String financials, int id, String favoriteExercise, String fitnessGoal) {
		super(name, phoneNumber, emailAddress, financials);
		this.favoriteExercise = favoriteExercise;
		this.fitnessGoal = fitnessGoal;
		this.financials = financials;
		memberID++;
		this.id = memberID;
	}
	
	public static int getMemberID() {
		return memberID;
	}
	public static void setMemberID(int newMemberID) {
        memberID = newMemberID;
    }

	public void setId() {
		this.id = memberID;
	}

	public String getFavoriteExercise() {
		return favoriteExercise;
	}

	public void setFavoriteExercise(Scanner scan, Member newMem) {
		System.out.println("We value community here at Big Dawg's©, so we wanna match you up with a similar Dawg to show you the ropes.");
		System.out.println("First, enter your favorite type of exercise between \"Cardio\", \"Strength\", or \"HIIT\"");
		System.out.println("We also want your feedback here so we can provide the most desired equipment accordingly");
        String favoriteExercise = scan.nextLine();
        this.favoriteExercise = favoriteExercise;
        while(!favoriteExercise.equalsIgnoreCase("Cardio") && !favoriteExercise.equalsIgnoreCase("Strength") && !favoriteExercise.equalsIgnoreCase("HIIT")) {
        	System.out.println("Check your spelling! Make sure your answer is either cardio, strength, or HIIT.");
        	favoriteExercise = scan.nextLine();
        	if(favoriteExercise.equalsIgnoreCase("cardio") || favoriteExercise.equalsIgnoreCase("strength") || favoriteExercise.equalsIgnoreCase("HIIT")) {
                this.favoriteExercise = favoriteExercise;
                break;
                }
        	}
        GymManagement.addFavoriteExercise(newMem, favoriteExercise);
	}

	public String getFitnessGoal() {
        return fitnessGoal;
    }

	public void setFitnessGoal(Scanner scan) {
		System.out.println("Here at Big Dawg's Gym©, we make sure everyone gets the chance to be guided to greatness.");
		System.out.println("To ensure our new Dawgs get the chance to start off strong, we'll set you up with a free session with a trainer that specializes in your goal.");
		System.out.println("For your fitness goal, choose either \"Cardio\", \"Strength\", or \"HIIT\"");
        String fitnessGoal = scan.nextLine();
        this.fitnessGoal = fitnessGoal;
        while(!fitnessGoal.equalsIgnoreCase("Cardio") && !fitnessGoal.equalsIgnoreCase("Strength") && !fitnessGoal.equalsIgnoreCase("HIIT")) {
        	System.out.println("Check your spelling! Make sure your answer is either cardio, strength, or HIIT.");
        	fitnessGoal = scan.nextLine();
        	if(fitnessGoal.equalsIgnoreCase("cardio") || fitnessGoal.equalsIgnoreCase("strength") || fitnessGoal.equalsIgnoreCase("HIIT")) {
                this.fitnessGoal = fitnessGoal;
                break;
                }
        	}
        }
	public void printInfo(Member mem, Scanner scan) {
    	System.out.println("Name: " + name);
    	System.out.println("Phone Number: " + phoneNumber);
    	System.out.println("Email Address: " + emailAddress);
    	System.out.println("Last 4 Digits of Credit Card: " + financials.substring(12));
    	System.out.println("Your personal Big Dawgs ID#: " + id);
    	System.out.println("Your favorite exercise: " + favoriteExercise);
    	System.out.println("Your fitness goal area: " + fitnessGoal);
    	System.out.println("");
    	System.out.println("Now time to match you up with a fellow dawg and a personal trainer.");
    	System.out.println("We'll match you up with a member that has the same favorite exercise and fitness goal as you first.");
    	for (Member member : GymManagement.members) {
    		if(mem.getFavoriteExercise().equalsIgnoreCase(member.getFavoriteExercise()) && mem.getFitnessGoal().equalsIgnoreCase(member.getFitnessGoal())) {
    			System.out.println("Member name: " + member.getName());
    			System.out.println("Member phone number: " + member.getPhoneNumber());
    			scan.nextLine();
    			break;
    		}
    	}
    	System.out.println("");
    	System.out.println("Now it's time to match you up with a personal trainer for your free specialized training session!");
    	System.out.println("Make sure to give them a call to schedule your session!");
    	scan.nextLine();
    	for (Employee emp : GymManagement.employees) {
    		if(mem.getFitnessGoal().equalsIgnoreCase(emp.getSpecialtyExercise())) {
    			System.out.println("Trainer name: " + emp.getName());
    			System.out.println("Trainer phone number: " + emp.getPhoneNumber());
    		}
    	} 	
	}
}