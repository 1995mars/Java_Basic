/**
 * Created by timbuchalka on 12/08/2016.
 */

public class Demo {

    public static void main(String[] args) {
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

        VampyreKing dracula = new VampyreKing("Dracula");
        dracula.showInfo();
//        dracula.takeDamage(12);
//        dracula.showInfo();

        while (dracula.getLives() > 0) {
            if(dracula.dodges()) {
                continue;
            }

            if(dracula.runAway()) {
                System.out.println("Dracula ran away");
                break;
            } else {
                dracula.takeDamage(12);
                dracula.showInfo();
            }
        }
    }
}
