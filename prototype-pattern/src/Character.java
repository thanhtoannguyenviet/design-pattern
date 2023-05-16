public class Character {
    private int HP;
    private String name;
    private String weapon;

    public Character clone(){
        return new Character(this);
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Weapon: "+weapon);
        System.out.println("HP: "+HP);
    }

    public Character(int HP, String name, String weapon) {
        this.HP = HP;
        this.name = name;
        this.weapon = weapon;
    }
    public Character(){

    }
    public Character(Character character){
        this.HP = character.HP;
        this.name = character.name;
        this.weapon = character.weapon;
    }
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
