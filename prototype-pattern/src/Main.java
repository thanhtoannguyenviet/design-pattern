public class Main {
    public static void main(String[] args) {
        Character character = new Character(100,"swordsman","Sword");
        Character character1 = character.clone();
        character1.setName("Magician");
        character1.setWeapon("Magic wand");
        Character character2 = character.clone();
        character.show();
        character1.show();
        character2.show();
    }
}