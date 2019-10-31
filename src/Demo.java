
/**
 * Created by timbuchalka on 12/08/2016.
 */

public class Demo {

    public static void main(String[] args) {

        VampyreKing dracula = new VampyreKing("Dracula");
        dracula.showInfo();

        dracula.setLives(0);

        do {
            if (dracula.dodges()) {
                dracula.setLives(dracula.getLives() + 1);
                continue;
            }

            if (dracula.runAway()) {
                System.out.println("Dracula ran away");
                break;
            } else {
                dracula.takeDamage(80);
                dracula.showInfo();
            }
        } while (dracula.getLives() > 0);
        System.out.println("====================================");


//        for(int i=0; i<10; i++) {
//            VampyreKing dracula = new VampyreKing("Dracula");
//            dracula.showInfo();
//
//            while (dracula.getLives() > 0) {
//                if(dracula.dodges()) {
//                    continue;
//                }
//
//                if(dracula.runAway()) {
//                    System.out.println("Dracula ran away");
//                    break;
//                } else {
//                    dracula.takeDamage(80);
//                    dracula.showInfo();
//                }
//            }
//            System.out.println("====================================");
//        }
//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();
//        Troll uglyTroll = new Troll("Ugly Troll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(30);
//
//        Vampyre vlad = new Vampyre("Vlad");
//        vlad.showInfo();
//        vlad.takeDamage(8);
//        vlad.showInfo()

//        VampyreKing dracula = new VampyreKing("Dracula");
//        dracula.showInfo();
//        dracula.takeDamage(12);
//        dracula.showInfo();

//        while (dracula.getLives() > 0) {
//            if(dracula.dodges()) {
//                continue;
//            }
//
//            if(dracula.runAway()) {
//                System.out.println("Dracula ran away");
//                break;
//            } else {
//                dracula.takeDamage(12);
//                dracula.showInfo();
//            }
//    }
        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
    }
}