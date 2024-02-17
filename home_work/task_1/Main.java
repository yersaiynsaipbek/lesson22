package Lessons.lesson_22.home_work.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Введите число: ");
            String input = scanner.nextLine();


            if(input.equals(" ")) {
                System.out.println(numbers);
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if(numbers.contains(number)) {
                    System.out.printf("Число %d существует в списке\n", number);
                } else {
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено не число. Пожалуйста, введите число.");
            }
        }
    }
}

