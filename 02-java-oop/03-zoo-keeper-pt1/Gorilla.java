public class Gorilla {
    Mammal Gorilla = new Mammal();
        public static int throwSomething(){
            Mammal.energyLevel -= 5;
            return Mammal.displayEnergy();
        }
        public static int eatBananas(){
            Mammal.energyLevel += 10;
            return Mammal.displayEnergy();
        }
        public static int climb(){
            Mammal.energyLevel -= 10;
            return Mammal.displayEnergy();
        }
}