import java.util.Random;
public class Pirate {
	protected int HP;
	protected int DEX; //dodge
	protected int STR;
	protected int SPD;
	protected int ACC; //accuracy
	
	protected String name;
	
	public void special(Pirate other) {
		
	}
	
	public void basicAtk(Pirate other) {
		Random rand = new Random();
		int dexChance = rand.nextInt(DEX);
		int accChance = rand.nextInt(other.getACC());
		if (accChance >= dexChance) {
			System.out.println("Take that!");
			other.takeDmg(STR);
		}else {
			System.out.println("Arrrgh! I missed.");
		}
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getDEX() {
		return DEX;
	}
	
	public int getSTR() {
		return STR;
	}
	
	public int getSPD() {
		return SPD;
	}
	
	public int getACC() {
		return ACC;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDEX(int dex) {
		DEX = dex;
	}
	
	public void setSTR(int str) {
		STR = str;
	}
	
	public void setSPD(int spd) {
		SPD = spd;
	}
	
	public void setACC(int acc) {
		ACC = acc;
	}
	

	public void takeDmg(int damage) {
		HP -= damage;
	}
	
	public void lowerStat(Pirate other, String stat, int amt) {
		if (stat.equals("DEX")) {
			other.setDEX(other.getDEX() - amt);
			
		}else if (stat.equals("STR")) {
			other.setDEX(other.getSTR() - amt);
			
		}else if (stat.equals("SPD")) {
			other.setDEX(other.getSPD() - amt);
			
		}else if (stat.equals("ACC")) {
			other.setDEX(other.getACC() - amt);
		}
	}
	public void taunt(Pirate other) {
		
	}
	public String toString(){
		String info = name + "\n\n" 
					+"HP: " + HP + "\n"
					+ "DEX: " + DEX + "\n"
					+ "STR: " + STR + "\n"
					+ "SPD: " + SPD + "\n"
					+ "ACC: " + ACC;
		return info;
					
	}
}
