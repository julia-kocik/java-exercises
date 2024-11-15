import java.util.Scanner;

public class CharReplace {
    public static void main(String[] args) {
      char[] array = new char[5];
      int min = 'A';
      int max = 'Z';

        // wypełnienie
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (Math.random() * (max-min+1) +min);
        }
        // wyświelenie przed
        System.out.println("Wyświetl elementy przed: ");
        for(char i:array) {
            System.out.println(i);
        }
        // dopóki array nie zawiera tylko zer
        while(!doesArrayContainOnlyZero(array)) {
            System.out.println("Wprowadź poprawny znak a przedziale A-Z.");
            Scanner scanner = new Scanner(System.in);
            char c = scanner.next().charAt(0);

            //walidacja
            while(((int) c < min) || ((int) c > max)) {
                System.out.println("Wprowadź poprawny znak.");
                c = scanner.next().charAt(0);
            }

            //ile razy wystapił znak w tablicy i zastąpi go zerem
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]== c) {
                    count++;
                    array[i] = '0';
                }
            }

            // wyświelenie po
            System.out.println("Count: " + count + ". Wyświetl elementy po: ");
            for(char i:array) {
                System.out.println(i);
            }
        }
    }
    //czy tylko zero jest w tablicy
    static boolean doesArrayContainOnlyZero(char[] array) {
        for(char c:array) {
            if(c!='0') {
                return false;
            }
        }
        return true;
    }
}
