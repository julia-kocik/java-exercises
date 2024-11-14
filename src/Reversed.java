import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scanner.nextInt();
        int reversed = 0;
        while(input > 0) {
            // take last digit
            int lastDigit = input % 10;
            // reversed should equal reversed*10 + lastDigit
            reversed = reversed*10 + lastDigit;
            // input should equal input without last digit
            input /= 10;
        }
        if(((reversed >> 31) & 0b1) == 1) {
            // 2147483647
            System.out.println("Reversed number exceeds 32bit scope");
        } else {
            System.out.println(reversed);
        }
    }

}
