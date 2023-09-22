public class Class06 {
    public static int add2n(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = add2n(5);
        System.out.println("1+2+...+5 的结果是：" + result1);

        int result2 = add2n(10);
        System.out.println("1+2+...+10 的结果是：" + result2);
    }
}
