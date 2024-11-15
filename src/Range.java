public class Range {
    public static void main(String[] args) {
        try {
            // walidacja
            if (args.length != 4) {
                System.out.println("Niepoprawna liczba argumentów!");
                return;
            } else if ((Double.parseDouble(args[1])) > (Double.parseDouble(args[2]))) {
                System.out.println("Początek zakresu nie może być większy niż koniec zakresu!");
                return;
            } else if ((Double.parseDouble(args[3])) < 0) {
                System.out.println("Róźnica musi być dodatnia!");
                return;
            }

            if (args[0].equals("-d")) {
                for (double i = Double.parseDouble(args[1]); i <= Double.parseDouble(args[2]); i += Double.parseDouble(args[3])) {
                    System.out.println(i);
                }
            } else if (args[0].equals("-i")) {
                for (int i = Integer.parseInt(args[1]); i <= Integer.parseInt(args[2]); i += Integer.parseInt(args[3])) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Niepoprawna flaga!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono wartości nieliczbowe dla args[1], args[2] i args[3]");
        }

    }
}
