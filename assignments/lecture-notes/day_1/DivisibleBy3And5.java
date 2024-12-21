package day_1;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 14;

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else if (a % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (a % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        sc.close();
    }
}
