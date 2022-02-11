public class Arts {
    public String name;
    public int stat;
    public int strength;

    public Arts(String name, int stat, int strength) {
        this.name = name;
        this.stat = stat;
        this.strength = strength;
    }

    public void isStrenght() {
        if (this.strength == 0) {
            System.out.println(this.name + " разрушен. Требуется починка!");
        }
    }

    public int incStat() {
        this.isStrenght();
        if (this.strength > 0){
            this.strength--;
            return this.stat;
        } else {
            return 0;
        }
    }
}
