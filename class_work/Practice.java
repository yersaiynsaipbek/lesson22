package Lessons.lesson_22.class_work;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Double> temperature = new ArrayList<>();

        temperature.add(92.3);
        temperature.add(12.4);
        temperature.add(74.1);
        temperature.add(45.0);


        double max = 0;
        for (int i = 0; i < temperature.size(); i++) {
            if (temperature.get(i) > max) {
                max = temperature.get(i);
            }
        }
        System.out.println("Самая высокая температура: " + max + " °С.");
    }
}
