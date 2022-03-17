package units;

public class Dragon extends Unit {
    public int flySpeed;

    public Dragon(String name, int hp, int offense, int defense, int flySpeed) {
        super(name, hp, offense, defense);
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.println(name + " улетает");
    }

    public void fireBreathe(Unit target) {
        int k = offense;
        System.out.println(name + " дышит огнем!");
        offense = (int) (offense * 1.5);
        this.attack(target);
        offense = k;
    }
}
