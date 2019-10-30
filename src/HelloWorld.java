/**
 * Created by timbuchalka on 12/08/2016.
 */

public class HelloWorld {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);

        if(isGameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("You're still alive!");
        }
    }
}
