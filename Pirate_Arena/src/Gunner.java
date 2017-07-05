import java.util.Random;
public class Gunner extends Pirate{

  public Gunner() {
    HP = 80;
    DEX = 55;
    STR = 10;
    SPD = 75;
    ACC = 75;
    name = "Plank";
  }

  public Gunner(String name) {
    this();
    this.name = name;
  }

  //special move
  public void special(Pirate other) {
    System.out.println(name + " loaded Bullet Bill into the pistol and unleashed.");
    Random rand = new Random();
    int extra = rand.nextInt(11) + 10;
    other.takeDmg(STR + extra);
    System.out.println(other.getName() + " took " + (STR + extra) + " damage");
    displayHP(other);

  }

  public void taunt(Pirate other) {
    System.out.println("Watch out, ye might need another eyepatch after this.");
    other.lowerStat(other, "ACC", 5);
    System.out.println(other.getName() + "'s ACC has been lowered.");
  }
}
