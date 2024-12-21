package day_1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float b = sc.nextFloat();

        float c = (b * h) / 2;
        System.out.println(c);
        sc.close();

    }
}
