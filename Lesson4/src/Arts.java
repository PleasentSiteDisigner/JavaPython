public class Arts {
    public String name;
//    public int offense;
//    public int defense;
    public int strength;
    public static int idSt = 0;
    public int id;

    public Arts(String name, int strength) {
        this.name = name;
//        this.defense = defense;
//        this.offense = offense;
        this.strength = strength;
        this.id = idSt++;
    }

    public void isStrenght() {
        if (this.strength == 0) {
            System.out.println(this.name + " разрушен. Требуется починка!");
        }
    }



}
