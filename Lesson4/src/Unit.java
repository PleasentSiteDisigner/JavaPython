public class Unit {
    public String name;
    public int hp;
    public int offense;
    public int defense;
    public Arts arms;
    public Arts armor;
    public int[] robe = {0, 0};
    public int[] bag = {0, 0, 0, 0};

    public Unit(String name, int hp, int offense, int defense, Arts arms, Arts armor) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.defense = defense;
        this.arms = arms;
        this.armor = armor;
        System.out.println(name + " HP: " + hp);
    }

    public void attack(Unit target) {
//        int resultOffense;
//        if (weapon) {
//            resultOffense = arms.offense + offense;
//        }
        int damage = offense + arms.incAttack() - target.defense - target.armor.incDef();
        if (damage > 0) {
            target.hp -= damage;
            System.out.println(name + " наносит " + damage + " единиц урона.");
            target.isAlive();
        } else
            System.out.println(name + " не причиняет урона " + target.name + "!");
    }

//    public void haveWeapon(Unit target) {
//        int damage = offense - target.defense;
//        if (damage > 0) {
//            hp -= damage;
//            System.out.println(name + " наносит " + damage + " единиц урона");
//            target.isAlive();
//        } else
//            System.out.println(name + " не причиняет урона " + target.name + "!");
//    }

    public void isAlive() {
        if (hp <= 0) {
            System.out.println(name + " погибает.");
        } else
            System.out.println("Здоровье " + name + " становится " + hp + ".");
    }

    public static void info() {
        System.out.println("Юнит");
    }
}
