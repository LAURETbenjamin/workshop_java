public class Fibonacci{
    public static int fibonacci (int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fibonacci(i - 1) + fibonacci(i - 2);
    }
    public static int secfibonacci (int i) {
        int a = 0;
        int b = 0;
        int tmp = 0;

        for (int j = 1;j <= i;j++) {
            tmp = a;
            a = b;
            b = tmp + b;
        }
        return a;
    }
    public static void main (String[] args) {
        int rec = fibonacci(10);
        int ite = fibonacci(10);
        System.out.printf("Suite de fibonacci de 10\n");
        System.out.printf("récursive %d\n", rec);
        System.out.printf("itérative %d\n", ite);
    }
}
