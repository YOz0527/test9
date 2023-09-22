public class Class07 {
    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            long temp = power(x, n / 2);
            return temp * temp;
        } else {
            long temp = power(x, (n - 1) / 2);
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 32;
        long result = power(x, n);
        System.out.println(x + " 的 " + n + " 次方是：" + result);
    }
}
