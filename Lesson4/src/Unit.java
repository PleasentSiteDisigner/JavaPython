public class Unit {
    public String name;
    public int hp;
    public int offense;
    public int defense;
    public boolean weapon = true;
    public boolean armor = true;

    public Unit(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.defense = defense;
        System.out.println(name + " HP: " + hp);
    }

    public void attack(Unit target, Arts arms) {
//        int resultOffense;
//        if (weapon) {
//            resultOffense = arms.offense + offense;
//        }
        arms.isStrenght();
        int damage = offense + arms.offense - target.defense;
        if (damage > 0) {
            System.out.println(name + " наносит " + damage + " единиц урона");
            System.out.println("Здоровье " + target.name + " становится " + (target.hp - damage));
        } else
            System.out.println(name + " не причиняет урона " + target.name + "!");
    }

    public void haveWeapon(Unit target) {
        int damage = offense - target.defense;
        if (damage > 0) {
            System.out.println(name + " наносит " + damage + " единиц урона");
            System.out.println("Здоровье " + target.name + " становится " + (target.hp - damage));
        } else
            System.out.println(name + " не причиняет урона " + target.name + "!");
    }

    public static void info() {
        System.out.println("Юнит");
    }
}
