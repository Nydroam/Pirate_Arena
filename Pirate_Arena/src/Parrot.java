import java.util.Random;
public class Parrot extends Pirate{

  public Parrot() {
    HP = 1000;
    DEX = 99;
    STR = 50;
    SPD = 99;
    ACC = 99;
    name = "Paco";
  }

  public Parrot(String name) {
    this();
    this.name = name;
  }

  //special move
  public void special(Pirate other) {
    System.out.println(name + " Bok. *Tilts head to the side*");
    Random rand = new Random();
    int extra = rand.nextInt(40) + 15;
    other.takeDmg(STR + extra);
    System.out.println(other.getName() + " took " + (extra + STR) + " damage.");
    displayHP(other);
  }

  public void taunt(Pirate other) {
    System.out.println("*Stare*");
    other.lowerStat(other, "ACC", 10);
    other.lowerStat(other, "DEX", 10);
    other.lowerStat(other, "SPD", 10);
    other.lowerStat(other, "STR", 10);

    System.out.println(other.getName() + "'s ACC, DEX, SPD, and STR have lowered significantly.'");

  }
}
