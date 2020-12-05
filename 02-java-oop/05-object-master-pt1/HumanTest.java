public class HumanTest {
    public static void main(String[] args) {
        
        Human Atlas = new Human();

        Human Bandit = new Human();

        Atlas.attack(Bandit);
        System.out.println(Bandit.health);

    }
}