import  java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;
public class GuessANumber {
    public static void main (String[] args){
        int j = 0;
        int nb = (RandomGenerator.getDefault().nextInt(0, 100));
        Scanner scan = new Scanner(System.in);
        System.out.print("Your guess ? ");

        while (scan.hasNext()) {
            int guess = scan.nextInt();
            j += 1;
            if (guess < nb)
                System.out.print("too low\n");
            if (guess > nb)
                System.out.print("too hight\n");
            if (guess == nb) {
                System.out.printf("Try = %d\n", j);
                break;
            }
            System.out.print("Your guess ? ");
        }
    }
}