public class Dragon extends Unit {
    public int flySpeed;

    public Dragon(String name, int hp, int offense, int defense, int flySpeed, Arts arms, Arts armor) {
        super(name, hp, offense, defense);
        this.flySpeed = flySpeed;
    }

//    public void attack(Unit target) {
//        int damage = offense - target.defense;
//        if (damage > 0) {
//            System.out.println(name + " наносит " + damage + " единиц урона");
//            System.out.println("Здоровье " + target.name + " становится " + (target.hp - damage));
//        } else
//            System.out.println(name + " не причиняет урона " + target.name + "!");
//    }

    public void fly() {
        System.out.println("Летающее существо");
    }

    public void fireBreathe() {
        System.out.println("Дыхание дракона");
    }
}
