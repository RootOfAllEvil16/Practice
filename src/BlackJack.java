import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card A: ");
        int cardA = scanner.nextInt();
        System.out.println("Enter card B:");
        int cardB = scanner.nextInt();
        scanner.close();

        if (cardA <= 0 || cardB <= 0) {
            System.out.println("Error. Points can`t be negative.");
            System.exit(-1);
        } else if ((cardA > cardB && cardA <= 21) || (cardB > 21 && cardA <= 21)) {
            int BlackJackScore =  cardA;
            System.out.println("Number of points = " + BlackJackScore);
        } else if ((cardB > cardA && cardB <= 21) || (cardA > 21 && cardB <= 21)) {
            int BlackJackScore = cardB;
            System.out.println("Number of points = " + BlackJackScore);
        } else if (cardA > 21 & cardB > 21){
            System.out.println("Number of points = 0");
        }
    }
}
