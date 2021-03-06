
public class Captain extends Pirate{

	public Captain() {
		HP = 100;
		DEX = 65;
		STR = 7;
		SPD = 50;
		ACC = 65;
		name = "Blackbeard";
	}

	public Captain(String name) {
		this();
		this.name = name;
	}

	//special move
	public void special(Pirate other) {
		STR += 1;
		DEX += 5;
		ACC += 5;

		System.out.println(name + " bulked up. STR, DEX, and ACC increased.");
	}

	public void taunt(Pirate other) {
		System.out.println("Walk de plank ye scoundrel.");
		other.lowerStat(other, "DEX", 2);
		other.lowerStat(other, "ACC", 2);
		System.out.println(other.getName() + "'s DEX and ACC has lowered.");
	}

}
