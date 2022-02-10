public class Unit {
    public String name;
    public int hp;
    public int offense;
    public int defense;
    public Arts[] robe;
    public Arts[] bag;

    public Unit(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.defense = defense;
        this.robe = new Arts[2];
        this.bag = new Arts[4];
        System.out.println(name + " HP: " + hp);
    }

    public void attack(Unit target) {
//        int resultOffense;
//        if (weapon) {
//            resultOffense = arms.offense + offense;
//        }
        int damage = offense + robe[0].incStat() - target.defense - target.robe[1].incStat();
        if (damage > 0) {
            target.hp -= damage;
            System.out.println(name + " наносит " + damage + " единиц урона.");
            if (target.isAlive() == false) {
                for (int i = 0; i < 4; i++ ) {
                    if (bag[i] == null) {
                        if (target.robe[0] != null) {
                            bag[i] = target.robe[0];
                            target.robe[0] = null;
                            System.out.println(name + " забирает в сумку " + bag[i].name);
                        } else if (target.robe[1] != null) {
                            bag[i] = target.robe[1];
                            target.robe[1] = null;
                            System.out.println(name + " забирает в сумку " + bag[i].name);
                        }
                    }
                }
            }
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

    public boolean isAlive() {
        if (hp <= 0) {
            System.out.println(name + " погибает.");
            return false;
        } else
            System.out.println("Здоровье " + name + " становится " + hp + ".");
        return true;
    }

    public static void info() {
        System.out.println("Юнит");
    }
}
