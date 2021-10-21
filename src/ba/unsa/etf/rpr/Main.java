package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("All numbers between 1 and " + n + " that are divisible by the sum of their digits are: ");
        for (int i = 2; i < n; i++)
            if (i % sumaCifara(i) == 0)
                System.out.print(i + " ");
    }

    private static int sumaCifara(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }
}
