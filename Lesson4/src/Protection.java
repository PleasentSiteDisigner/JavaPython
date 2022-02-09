public class Protection extends Arts{
    public int defense;

    public Protection(String name, int defense, int strength) {
        super(name, strength);
        this.defense = defense;
    }

    public int incDef() {
        this.isStrenght();
        if (this.id != 0 && this.strength > 0){
            this.strength--;
            return this.defense;
        } else {
            return 0;
        }
    }
}
