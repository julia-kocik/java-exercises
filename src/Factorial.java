public class Factorial {
    public static void main(String[] args) {
        System.out.println(countFactorial(5));
    }
    static int countFactorial(int num) {
        return (num==0 || num == 1) ? 1 : num* countFactorial(num-1);
    }
}
