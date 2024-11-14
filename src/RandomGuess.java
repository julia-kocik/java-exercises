import java.util.Scanner;

public class RandomGuess {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę od 0 do 100 000.");
        int input = scanner.nextInt();
        int count = 0;
        int guess = (int) (Math.random() * 100001);
        while(!checkValidity(input)) {
            System.out.println("Wprowadzono niepoprawną liczbę, spróbuj jeszcze raz");
            input = scanner.nextInt();
        }
        while(guess != input) {
            count++;
            guess = (int) (Math.random() * 100001);
        }
        System.out.println("Liczbę znaleziono po " + count + " próbach.");
        scanner.close();
    }
    static boolean checkValidity(int input) {
        return input >= 0 && input <= 100001;
    }
}