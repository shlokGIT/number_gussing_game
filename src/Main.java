
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int lower = 1;
        int upper = 100;
        Random rand = new Random();
        int target = rand.nextInt(lower, upper + 1);
        System.out.println(target);
        System.out.printf("guess a number bw %d and %d: ", lower, upper);

        Scanner userInput = new Scanner(System.in);
        int guess =0;
        while(guess != target){
            guess = userInput.nextInt();
            if(guess == target){
                System.out.println("correct!");
            }else if ( guess > target){
                System.out.println("guess lower! ");
            }else{
                System.out.println(" guess higher!");
            }

        }
        if (guess == target) {
            System.out.println("correct");
        }else{
            System.out.println("incorrect");

            System.out.printf("%d and %d,", target, guess);


        }
    }
}