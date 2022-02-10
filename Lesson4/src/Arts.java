public class Arts {
    public String name;
    public int stat;
//    public int defense;
    public int strength;

    public Arts(String name, int stat, int strength) {
        this.name = name;
//        this.defense = 0;
        this.stat = stat;
        this.strength = strength;
    }

    public void isStrenght() {
        if (this.strength == 0) {
            System.out.println(this.name + " разрушен. Требуется починка!");
        }
    }

    public int incStat() {
        if (this.name != "" && this.strength > 0){
            this.strength--;
            this.isStrenght();
            return this.stat;
        } else {
            return 0;
        }
    }

//    public int incDef() {
//        this.isStrenght();
//        if (this.name != "" && this.strength > 0){
//            this.strength--;
//            return this.defense;
//        } else {
//            return 0;
//        }
//    }

}
