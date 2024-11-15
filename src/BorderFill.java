import java.util.Scanner;


public class BorderFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź szerokość");
        int width = scanner.nextInt();
        System.out.println("Wprowadź wysokość");
        int height = scanner.nextInt();

        System.out.println("Podaj znak wypełnienia (fill):");
        char fill = scanner.next().charAt(0);
        System.out.println("Podaj znak obramowania (border):");
        char border = scanner.next().charAt(0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(border);
                } else {
                    System.out.print(fill);
                }
            }
            System.out.println();
        }
    }
}
