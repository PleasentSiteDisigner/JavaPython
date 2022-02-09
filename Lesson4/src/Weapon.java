public class Weapon extends Arts{
    public int offense;

    public Weapon(String name, int offense, int strength) {
        super(name, strength);
        this.offense = offense;
    }

    public int incAttack() {
        this.isStrenght();
        if (this.id != 0 && this.strength > 0){
            this.strength--;
            return this.offense;
        } else {
            return 0;
        }
    }

}
