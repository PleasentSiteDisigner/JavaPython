public class Game {
    public static void main(String[] args) {
        Arts zero = new Arts("", 1);
        Protection chest = new Protection("Chest", 16, 10);
        Weapon axe = new Weapon("Axe", 22, 20);

        Unit orc = new Unit("Orc", 15, 8, 4, axe, zero);
        Unit elf = new Unit("Wood elf", 15, 9,5, zero, chest);
        Dragon blackDragon = new Dragon("Black Dragon", 300, 25, 25, 15, zero, zero);

        orc.attack(blackDragon);
        orc.attack(blackDragon);
        elf.attack(blackDragon);
        orc.attack(elf);
        blackDragon.attack(orc);
        elf.attack(blackDragon);

    }
}
