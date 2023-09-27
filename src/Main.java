
public class Main {
    public static void main(String[] args) {
HavingSuperAbility[] heroes={new Medic(),new Megic(),new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].applySuperAbility());
        }

    }
}