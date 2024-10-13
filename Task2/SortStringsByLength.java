package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків:");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Створення масиву рядків
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть рядок №" + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }

        // Сортування
        Arrays.sort(strings, (s1, s2) -> {
            return Integer.compare(s2.length(), s1.length()); // Порівняння рядків
        });

        System.out.println("Рядки в порядку спадання довжини:");
        for (String str : strings) {
            System.out.println(str + " --> довжина: " + str.length());
        }
    }
}
