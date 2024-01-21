import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    GymManagement scenario = new GymManagement();
	    /*To print an array:
	    
	    String delimiter = " and ";
	    String joinedJobPositions = String.join(delimiter, GymManagement.jobPositions);
	    System.out.println(joinedJobPositions);
	    //prints Personal Trainer and Receptionist
	    */
	    
	    Employee pt1 = new Employee("Marcus", "555-1234", "Marcus@example.com", "1111111111111111", "Direct Deposit", "Cardio", "Personal Trainer");
        Employee pt2 = new Employee("Mark", "555-5555", "Mark@example.com", "2222222222222222", "Direct Deposit", "Strength", "Personal Trainer");
        Employee pt3 = new Employee("Marker", "555-1111", "Marker@example.com", "3333333333333333", "Direct Deposit", "HIIT", "Personal Trainer");
        Employee rec1 = new Employee("Markelle", "555-3333", "Markelle@example.com", "4444444444444444", "Direct Deposit", "", "Receptionist");
        Employee rec2 = new Employee("Marky", "555-2222", "Marky@example.com", "5555555555555555", "Direct Deposit", "", "Receptionist");
        Employee rec3 = new Employee("Markette", "555-4444", "Markette@example.com", "6666666666666666", "Direct Deposit", "", "Receptionist");
        Member mem1 = new Member("Danny", "222-3333", "", "", 446, "Cardio", "HIIT");
        Member mem2 = new Member("Daniel", "444-3333", "", "", 447, "Cardio", "Strength");
        Member mem3 = new Member("Danielson", "222-3344", "", "", 448, "Strength", "Cardio");
        Member mem4 = new Member("Danielle", "444-5555", "", "", 449, "Strength", "HIIT");
        Member mem5 = new Member("Darnelle", "445-6756", "", "", 450, "HIIT", "Strength");
        Member mem6 = new Member("Dylan", "4422-3377", "", "", 451, "HIIT", "Cardio");
        

        scenario.registerEmployee(pt1);
        scenario.registerEmployee(pt2);
        scenario.registerEmployee(pt3);
        scenario.registerEmployee(rec1);
        scenario.registerEmployee(rec2);
        scenario.registerEmployee(rec3);
        scenario.registerMember(mem1);        
        scenario.registerMember(mem2);        
        scenario.registerMember(mem3);        
        scenario.registerMember(mem4);
        scenario.registerMember(mem5);
        scenario.registerMember(mem6);
        	    
	    System.out.println("Welcome to the website of Big Dawg's Gym©: the strongest website in town!");
	    System.out.println("Input 1 to enter our employee application process. Input 2 to enter our member application process.");
	    System.out.print("Enter 1 or 2: ");
	    String userDecision = scanner.nextLine();
	    
	    	while(true) {
	    	if (userDecision.equalsIgnoreCase("1")) {
	        scenario.handleJobApplication(scanner);
	        break;
	        } 
	    	else if (userDecision.equalsIgnoreCase("2")) {
	        scenario.handleMemberRegistration(scanner);
	        break;
	        }
	    	else {
	    	System.out.println("Please enter 1 or 2:");
	    	userDecision = scanner.nextLine();
	    	}
	    	}
	
	    
}

}
