
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class GymManagement {
	protected static String[] jobPositions = {"Personal Trainer", "Receptionist"};
	protected static HashMap<String, JobApplicant> jobApplicants = new HashMap<>();
	protected static ArrayList<Employee> employees = new ArrayList<>();
    protected static ArrayList<Member> members = new ArrayList<>();
    protected static HashSet<String> favoriteExercises = new HashSet<>();
    protected static int receptionistCount = 0;

    public static boolean checkRiddleAnswer(String answer) {
        String correctAnswer = "Piano";
        return answer.equalsIgnoreCase(correctAnswer);
    }
    
    public static void addFavoriteExercise(Member mem, String fav) {
    	favoriteExercises.add(fav);
    }
    
    public void registerJobApplicant(JobApplicant jobApplicant) {
        jobApplicants.put(jobApplicant.getName(), jobApplicant);
    }


    public static void hireJobApplicant(JobApplicant jobApplicant) {
        Employee newEmployee = new Employee(jobApplicant.getName(), jobApplicant.getPhoneNumber(), jobApplicant.getEmailAddress(), jobApplicant.getFinancials(), jobApplicant.getPayChoice(), jobApplicant.getSpecialty(), jobApplicant.getDesiredPosition());
        employees.add(newEmployee);
        jobApplicants.remove(jobApplicant.getName());
    }
    
    public void registerEmployee(Employee employee) {
        employees.add(employee);
        if(employee.getJobPosition().equalsIgnoreCase("Receptionist")) {
        	receptionistCount++;
        }
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void matchMemberWithTrainer(Member member) {
        for (Employee employee : employees) {
            if (employee.getSpecialtyExercise().equalsIgnoreCase(member.getFitnessGoal())) {
                System.out.println(employee.getName());
            }
        }
        
    }
    public void handleJobApplication(Scanner scan) {
       JobApplicant newApplicant = new JobApplicant();
 
       System.out.println("We're happy you'd like to join the Big Dawgs© team! To get started,");
       newApplicant.setName(scan);
       
       newApplicant.setPhoneNumber(scan);
        
       newApplicant.setEmailAddress(scan);
        
       newApplicant.setFinancials(scan);
        
       newApplicant.setDesiredPosition(scan, newApplicant);
       
       if(newApplicant.getDesiredPosition().equalsIgnoreCase("Personal Trainer")) {
       newApplicant.setSpecialty(scan);
       
       newApplicant.setQuestionResponses(newApplicant.questionResponses, scan, newApplicant);
       
       System.out.println("Thanks for filling out Big Dawg's Gym© application! We'll get back to you in 3-5 business days!");
       System.out.println("Printed below is your inputted information. If anything looks incorrect, call us at 555-6789 and we'll update it for you!");
       newApplicant.printInfo();
       
       registerJobApplicant(newApplicant);
   }
}
       
    
    public void handleMemberRegistration(Scanner scan) {
        Member newMem = new Member();
    	
        System.out.println("Joining a new gym is Dawg Gone exciting, and we're so glad you chose to exercise at Big Dawg's©! To get started,");
    	newMem.setName(scan);
        
        newMem.setPhoneNumber(scan);
        
        newMem.setEmailAddress(scan);
        
        newMem.setFinancials(scan);
        
        newMem.setId();
        
        newMem.setFavoriteExercise(scan, newMem);
          
        newMem.setFitnessGoal(scan);
        
        System.out.println("Thank you for joining Big Dawg's Gym©!");
        System.out.println("Printed below is your inputted information and the next steps. We look forward to seeing you around The Pound©!");
        newMem.printInfo(newMem, scan);
        registerMember(newMem);
    }
    
}
