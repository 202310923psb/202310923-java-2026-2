import java.util.Scanner;

class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) { return m; }
        else if (m > n) { return gcd(n, (m % n)); }
        else { return gcd(m, (n % m)); }
    }

    int gcdByWhile(int m, int n) {
        while (n != 0) {
            int remainder = m % n;
            m = n;
            n = remainder;
        }
        return m;
    }

    public static void main(String[] args) {
        Homework4 h = new Homework4();
        Scanner scanner = new Scanner(System.in);
        int m, n;

        System.out.print("두 수를 입력하세요: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", h.gcd(m, n));
        System.out.printf("반복문으로 구한 두 수의 최대공약수는 %d입니다.\n", h.gcdByWhile(m, n));
    }
}
