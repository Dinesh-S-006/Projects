import java.util.*;

public class numberguessingGame {

    public static void gamecode() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("                                                      Welcome to Number Guessing Game                                                         ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
        System.out.println();
        System.out.println("Hey GUY !! Choose a  Number from 0 to 100");

        int number = scan.nextInt();
        scan.nextLine(); // consume the newline
        int SecreateNumber = random.nextInt(100) + 1;

        if (number < SecreateNumber) {
            System.out.println("Your number is TOO LOW !!");
        } else if (number > SecreateNumber) {
            System.out.println("Your number is TOO HIGH !!");
        } else if (number == SecreateNumber) {
            System.out.println("Congratulations! Your Number Matched");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }

        System.out.println("Do you want to continue the Game ");
        System.out.println("If Yes Press:1");
        System.out.println("If No Press:2");
        int replay=scan.nextInt();
2
        String s = scan.nextLine();

        if (replay==1) {
            gamecode(); // recursive call
        } else {
            System.out.println("Ok bye, See you Later");
        }
    }

    public static void main(String[] args) {
        gamecode();
    }
}
