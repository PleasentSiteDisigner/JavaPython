public class Game {
    public static void main(String[] args) {
        Arts zero = new Arts("", 0, 0); //Затычка для путсого слота артефакта
        Protection chest = new Protection("Chest", 16, 2);
        Protection shield = new Protection("Shield of Gods", 19, 20);

        Weapon axe = new Weapon("Axe", 22, 10);
        Weapon arch = new Weapon("Arch of Elf`s King", 25, 20);


        Unit orc = new Unit("Orc", 15, 8, 4);
        Unit elf = new Unit("Wood elf", 15, 9,5);
        Unit man = new Unit("Peasant", 1, 1,1);
        Dragon blackDragon = new Dragon("Black Dragon", 300, 25, 25, 15);

        elf.robe[0] = arch;
        man.robe[0] = axe;
        elf.robe[1] = shield;
        orc.robe[1] = chest;
        man.attack(orc);
        orc.attack(man);
        orc.attack(blackDragon);
        orc.attack(blackDragon);
        elf.attack(blackDragon);
        orc.attack(elf);
        blackDragon.attack(orc);
        elf.attack(orc);
        elf.attack(blackDragon);
        blackDragon.attack(elf);
        elf.attack(blackDragon);
        blackDragon.fireBreathe(elf);

        blackDragon.fly();
    }
}
