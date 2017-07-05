import java.util.Scanner;
import java.util.Random;

public class Arena {

	public static void checkWin(Pirate first, Pirate second) {
		if(first.getHP()<=0) {
			System.out.println(first.getName() + " has been defeated.");
			System.out.println(second.getName() + " wins!");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
			//List of pirates
			String[] pirateTypes = {"Captain", "Duelist", "Gunner", "Parrot"};
			
			Pirate Pirate0 = new Pirate();
			Pirate Pirate1 = new Pirate();
			//scanner to take in user input
			Scanner userInput = new Scanner(System.in);
			Random generator = new Random();
				
			//first option is AI, second is pvp
				
			boolean validChoice = false;
			boolean pvp = false;
			String choice = "0";
				
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
					System.out.println("Ah, a fresh one has arrived to face the Arena. Good luck... you'll need it...");
					System.out.println("First, what be yer name?");
					String name = userInput.nextLine();
					validChoice = false;
					System.out.println("Now, we gotta figure out what type of pirate ye be.");
					
					while(!validChoice) {
						
						System.out.println("Soo... what ye be?");
						
						for(int i = 0; i < pirateTypes.length - 1; i++) {
							int j = i+1;
							System.out.println(j + ". " + pirateTypes[i]);
						}
						choice = userInput.nextLine();
						validChoice = true;
						//create pirate subclass for player within these if statements
						if (choice.equals("1")) {
							System.out.println("So ye be a " + pirateTypes[0]+"!");
							Pirate0 = new Captain(name);
						}
						else if (choice.equals("2")) {
							System.out.println("So ye be a " + pirateTypes[1]+"!");
							Pirate0 = new Duelist(name);
						}
						else if (choice.equals("3")) {
							System.out.println("So ye be a " + pirateTypes[2]+"!");
							Pirate0 = new Gunner(name);
						}
						else if (choice.equals("4")) {
							System.out.println("So ye be a " + pirateTypes[3]+"!");
							Pirate0 = new Parrot(name);
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
					if(randChar == 0)
						Pirate1 = new Captain();
					else if(randChar == 1)
						Pirate1 = new Duelist();
					
					else if(randChar == 2)
					     Pirate1 = new Gunner();
					else
					      Pirate1 = new Parrot();
					
					System.out.println("Yer opponent be a " + enemy + "! Best of luck to ya!");
					
					while(!pvp) {
						System.out.println("What will you do?");
						System.out.println("1. Attack");
						System.out.println("2. Special");
						System.out.println("3. Taunt");
						
						//battle code here
						if(Pirate0.getSPD()<Pirate1.getSPD()) {
							int enemyMove = generator.nextInt(3);
							if(enemyMove == 0) {
								Pirate1.basicAtk(Pirate0);
							}
							if(enemyMove == 1) {
								Pirate1.special(Pirate0);
							}
							if(enemyMove == 2) {
								Pirate1.taunt(Pirate0);	
							}
							checkWin(Pirate0,Pirate1);
							validChoice = false;
							while(!validChoice) {
								choice = userInput.nextLine();
								validChoice = true;
								if (choice.equals("1")) {
									Pirate0.basicAtk(Pirate1);
								}
								else if(choice.equals("2")) {
									Pirate0.special(Pirate1);
								}
								else if(choice.equals("3")) {
									Pirate0.taunt(Pirate1);
								}
								else {
									validChoice = false;
								}
							}
							checkWin(Pirate1,Pirate0);
							
						}
						else {
							validChoice = false;
							while(!validChoice) {
								choice = userInput.nextLine();
								validChoice = true;
								if (choice.equals("1")) {
									Pirate0.basicAtk(Pirate1);
								}
								else if(choice.equals("2")) {
									Pirate0.special(Pirate1);
								}
								else if(choice.equals("3")) {
									Pirate0.taunt(Pirate1);
								}
								else {
									validChoice = false;
								}
							}
							checkWin(Pirate1,Pirate0);
							int enemyMove = generator.nextInt(3);
							if(enemyMove == 0) {
								Pirate1.basicAtk(Pirate0);
							}
							if(enemyMove == 1) {
								Pirate1.special(Pirate0);
							}
							if(enemyMove == 2) {
								Pirate1.taunt(Pirate0);	
							}
							checkWin(Pirate0,Pirate1);
						}
						
						
						
						
					}
				}
				else {//multiplayer
					System.out.println("So ye want to test yer skills against a fellow eh? Well best of luck to the both of ya!");
					while(pvp) {
						
					}
				}
	}

}
