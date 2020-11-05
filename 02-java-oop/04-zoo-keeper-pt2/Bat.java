public class Bat{
    Mammal Bat = new Mammal(300);

    public static int fly(){
        Mammal.energyLevel -= 50;
        return Mammal.energyLevel;
    }
    public static int eatHumans(){
        Mammal.energyLevel += 25;
        return Mammal.energyLevel;
    }
    public static int attackTown(){
        Mammal.energyLevel -= 100;
        return Mammal.energyLevel;
    }

}