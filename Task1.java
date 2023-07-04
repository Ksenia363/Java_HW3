// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка n: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = iScanner.nextInt();
            ArrayList<Integer> myarray = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < n; i++) {
                int x = ran.nextInt(n);
                myarray.add(x);
            }
            System.out.println(myarray);

            for (int i = myarray.size() - 1; i >= 0; i--) {
                int even = myarray.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число в списке:" + myarray.get(i));
                    myarray.remove(i);
                }
            }

            int min = myarray.get(0);
            int max = myarray.get(0);
            float sum = 0;
            for (int i = 0; i < myarray.size(); i++) {
                int num = myarray.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / myarray.size();

            Collections.sort(myarray);
            System.out.println("Список без четных чисел: \n " + myarray);

            System.out.println("Минимальное число: " + min);

            System.out.println("Максимальное число: " + max);

            System.out.println("Среднее арифметическое: " + average);

        }
    }
}