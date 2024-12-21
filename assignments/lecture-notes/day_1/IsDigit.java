package day_1;

import java.util.Scanner;

public class IsDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c - 48 >= 0 && c - 48 <= 9) {
            System.out.println("This is a digit");
        }
        sc.close();
    }
}
