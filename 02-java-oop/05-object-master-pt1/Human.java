public class Human {
    public int strength = 3;
    public int stealth = 3;
    public int intellegence = 3;
    public int health = 100;

    public void attack(Human target) {
        target.health -= this.strength;
        System.out.println("swings a sword and hits the target for " + this.strength + "damage");
    }

}