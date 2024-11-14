import java.util.Scanner;

public class Cash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbe");
        int input = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        // stworzyć tablicę z nominałami
        int[] numbers = new int[]{100,50,20,5,2,1};

        // stworzyc petle for po elementach tablicy
        for (int number : numbers) {
            // tworzymy zmienna count int
            // dzielimy input przez element tablicy i przypisujemy do count
            int count = input / number;
            // do resultu concatenujemy count x elem tablicy, jeśli count jest większy od 0
            if (count > 0) {
                result.append(count).append("x").append(number).append(";");
            }
            // do inputu przypisujemy reszte z dzielenia inputu przez element tablicy
            input = input % number;
        }
        // sout result
        System.out.println(result);
        scanner.close();
    }
}
