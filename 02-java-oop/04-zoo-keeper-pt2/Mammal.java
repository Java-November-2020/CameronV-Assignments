public class Mammal {
    public static int energyLevel;

    public Mammal(int energyLevel) {
        Mammal.energyLevel = energyLevel;
    }

    public static int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }
}