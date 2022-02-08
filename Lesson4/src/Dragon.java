public class Dragon extends Unit {
    public int flySpeed;

    public Dragon(String name, int hp, int offense, int defense, int flySpeed) {
        super(name, hp, offense, defense);
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.println("Летающее существо");
    }

    public void fireBreathe() {
        System.out.println("Дыхание дракона");
    }
}
