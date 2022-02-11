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
        int damage = offense - target.defense + this.checkStat(target);
        if (damage > 0) {
            target.hp -= damage;
            System.out.println(name + " наносит " + damage + " единиц урона.");
            if (target.isDead()) {
                this.checkAllArts(target);
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
        } else {
            System.out.println(name + " не причиняет урона " + target.name + "!");
        }
    }

    public int checkStat(Unit target) {
        int result = 0;
            if (this.robe[0] != null) {
                result += this.robe[0].incStat();
            }
            if (target.robe[1] != null) {
                result -= target.robe[1].incStat();
        }
            return result;
    }

    public void checkAllArts(Unit target) {
        for (int i = 0; i < 2; i++) {
            if (robe[i] == null && target.robe[i] != null) {
                robe[i] = target.robe[i];
                target.robe[i] = null;
                System.out.println(name + " подбирает себе " + robe[i].name);
            }
        }
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
        for (int i = 0; i < 4; i++ ) {
            if (bag[i] == null) {
                for (int j = 0; j < 4; j++) {
                    if (target.bag[j] != null) {
                        bag[i] = target.bag[j];
                        target.bag[j] = null;
                        System.out.println(name + " забирает в сумку " + bag[i].name);
                    }
                }
            }
        }
    }

    public boolean isDead() {
        if (hp <= 0) {
            System.out.println(name + " погибает.");
            return true;
        } else
            System.out.println("Здоровье " + name + " становится " + hp + ".");
        return false;
    }

//    public static void info() {
//        System.out.println("Юнит");
//    }
}
