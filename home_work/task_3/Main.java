package Lessons.lesson_22.home_work.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.println("Введите число: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(" ")){
                break;
            }

            try{
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e){
                System.out.println("Введено не число. Пожалуйста, введите число.");
            }
        }
        double total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number: numbers) {
            total += number;
            if (number>max){
                max = number;
            }

            if (number<min){
                min = number;
            }
        }

        double average = total / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(i));
                    numbers.set(i, temp);
                }

            }
            
        }

        System.out.println("Элементы списка: " + numbers);
        System.out.println("Количество элементов: " + numbers.size());
        System.out.println("Сумма чисел: " + total);
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Среднее значение: " + average);
        System.out.println("Сортированный список: " + numbers);



    }
}
