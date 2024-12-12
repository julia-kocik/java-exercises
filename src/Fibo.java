public class Fibo {
    public static void main(String[] args) {
        fibo(10);
    }
    static int[] fibo(int n) {
        int prev = 0;
        int current = 1;
        int[] tab = new int[n];

        tab[0] = prev;
        tab[1] = current;
        for (int i = 2; i < n; i++) {
            tab[i] = prev + current;
            int temp = current;
            current = prev + current;
            prev = temp;

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        return tab;
    }
}
