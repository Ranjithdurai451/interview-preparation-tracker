package day_1;

public class PrimeOrNot {
    public static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 27;
        boolean flag = isPrime(n);
        if (flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
