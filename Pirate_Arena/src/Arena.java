import java.util.Scanner;
import java.util.Random;

public class Arena {

	public static void main(String[] args) {
			//List of pirates
			String[] pirateTypes = {"Captain", "Gunner", "Swashbuckler", "Parrot"};
		
			//scanner to take in user input
			Scanner userInput = new Scanner(System.in);
			Random generator = new Random();
				
			//first option is AI, second is pvp
				
			boolean validChoice = false;
			boolean pvp = false;
			String choice;
				
			System.out.println("AHOY MATEYS!");
			System.out.println("Welcome to the Pirate Arena, where scallywags and scoundrels compete for booty, infamy, and glory!");
				//makes sure the input is valid
				while(!validChoice) {
					//introductory text and first selection
					
					
					System.out.println("So challenger, what be yer poison?");
					System.out.println("1. Challenge the Arena");
					System.out.println("2. Challenge a Matey");
					choice = userInput.nextLine();
				
					validChoice = true;
					if ( choice.equals("1") ) {
						pvp = false;
					}
					else if ( choice.equals("2") ) {
						pvp = true;
					}
					else {
						validChoice = false;
						System.out.println("Arr that don't be a choice. Let's try that again...");
					}
				}
				
				//single player
				if(!pvp) {
					validChoice = false;
					System.out.println("First, we gotta figure out what type of pirate ye be.");
					
					while(!validChoice) {
						choice = userInput.nextLine();
						System.out.println("Soo... what ye be?");
						
						for(int i = 0; i < pirateTypes.length - 1; i++) {
							int j = i+1;
							System.out.println(j + ". " + pirateTypes[i]);
						}
						validChoice = true;
						//create pirate subclass for player within these if statements
						if (choice.equals("1")) {
							System.out.println("So ye be a " + pirateTypes[0]+"!");
						}
						else if (choice.equals("2")) {
							System.out.println("So ye be a " + pirateTypes[1]+"!");
						}
						else if (choice.equals("3")) {
							System.out.println("So ye be a " + pirateTypes[2]+"!");
						}
						else if (choice.equals("4")) {
							System.out.println("So ye be a " + pirateTypes[3]+"!");
						}
						else {
							validChoice = false;
							System.out.println("I didn't catch that.");
						}
					}
					
					//choose randomly between four subclasses
					int randChar = generator.nextInt(pirateTypes.length);
					
					//create new enemy based on randChar here
					
					String enemy = pirateTypes[randChar];
					System.out.println("Yer opponent be a " + enemy + "! Best of luck to ya!");
					
					while(!pvp) {
						System.out.println("What will you do?");
						System.out.println("1. Attack");
						System.out.println("2. Special");
						System.out.println("3. Taunt");
						
						validChoice = false;
						while(!validChoice) {
							choice = userInput.nextLine();
							if (choice.equals("1")) {
								//
							}
							else if(choice.equals("2")) {
								
							}
							else if(choice.equals("3")) {
								
							}
							else {
								
							}
						}
						
						//battle code here
						
					}
				}
				else {//multiplayer
					System.out.println("So ye want to test yer skills against a fellow eh? Well best of luck to the both of ya!");
					while(pvp) {
					}
				}
	}

}
