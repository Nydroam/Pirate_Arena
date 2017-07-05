import java.util.Random;
public class Duelist extends Pirate{

  public Duelist() {
    HP = 120;
    DEX = 75;
    STR = 10;
    SPD = 40;
    ACC = 55;
    name = "Gang";
  }

  public Duelist(String name) {
    this();
    this.name = name;
  }

  //special move
  public void special(Pirate other) {
    System.out.println(name + " ate an Orenji and felt empowered. He leaped forward and struck with all his might.");
    Random rand = new Random();
    int extra = rand.nextInt(16) + 5;
    other.takeDmg(STR + extra);
    System.out.println(other.getName() + " took " + (STR + extra) + " damage.");
    lowerStat(this, "ACC", 10);
    displayHP(other);
    System.out.println("He now feels a little tired.");
  }

  public void taunt(Pirate other) {
    System.out.println("Ye can't face meh. Ye just a lad");
    other.lowerStat(other, "DEX", 5);
    System.out.println(other.getName() + "'s DEX has been lowered.");
  }
}
