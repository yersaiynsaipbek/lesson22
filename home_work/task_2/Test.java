package Lessons.lesson_22.home_work.task_2;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<>();
       ArrayList<Integer> repeatedNumbers = new ArrayList<>();


       while(true){
           System.out.println("Введите число: ");
           String input = scanner.nextLine();

           if(input.equalsIgnoreCase(" ")){
               System.out.println(repeatedNumbers);
               break;
           }

           try{
               int number = Integer.parseInt(input);
               if(numbers.contains(number) && !repeatedNumbers.contains(number)){
                    repeatedNumbers.add(number);
               }

               numbers.add(number);
           } catch (NumberFormatException e){
               System.out.println("Введено не число. Пожалуйста, введите число.");
           }
       }
    }
}
