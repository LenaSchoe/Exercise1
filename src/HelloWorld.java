import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello ASE2017 - How are you? :)");
	
		Scanner userInput = new Scanner (System.in);
		String userName;
		System.out.print("Please enter your name: ");
		userName=userInput.nextLine();
		userInput.close();
		
		HelloUser calledClass = new HelloUser();
		calledClass.greetUser(userName);
		
	}

}
