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
    other.takeDmg(STR + rand.nextInt(16) + 5);
    lowerStat(this, "ACC", 10);
    System.out.println("He now feels a little tired.");
  }

  public void taunt(Pirate other) {
    System.out.println("Ye can't face meh. Ye just a lad");
    other.lowerStat(other, "DEX", 5);
  }
}
