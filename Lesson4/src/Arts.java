public class Arts {
    public String name;
    public int offense;
    public int defense;
    public int strength;

    public Arts(String name, int offense, int defense, int strength) {
        this.name = name;
        this.defense = defense;
        this.offense = offense;
        this.strength = strength;
    }

    public void isStrenght() {
        if (this.strength == 0) {
            this.offense = 0;
            this.defense = 0;
            System.out.println(this.name + " разрушен. Требуется починка!");
        }
    }
}
