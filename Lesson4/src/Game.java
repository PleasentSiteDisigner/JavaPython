public class Game {
    public static void main(String[] args) {
        Unit orc = new Unit("Orc", 15, 8, 4);
        Unit elf = new Unit("Wood elf", 15, 9, 5);
        Dragon blackDragon = new Dragon("Black Dragon", 300, 25, 25, 15);
        Arts axe = new Arts("Axe", 5, 2, 0);

        orc.attack(elf, axe);
//        elf.attack(blackDragon);

        Unit.info();
    }
}
