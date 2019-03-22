import java.lang.System;
import java.util.Arrays;

public class arrayPractice {
    static String[] day = {"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static void main(String[] args) {


        int[] weekone = {65, 68, 72, 83, 73, 66, 85};
        int[] weektwo = {86, 87, 85, 78, 79, 78, 80};

        for (int index = 0; index < day.length; index++) {

        }
        System.out.println("Week 1 high Temperatures " + Arrays.toString(weekone));
        System.out.println("Week 2 High Temperatures " + Arrays.toString(weektwo));
        System.out.println();

        firstTemps(weekone);
        secondTemps(weektwo);
    }

    public static int firstTemps(int[] weekone) {

        for (int index = 0; index < 7; index++) {
        }
        int sum = 0;
        for (int index = 0; index < weekone.length; index++) {
            sum += weekone[index];
        }

        int average = sum / weekone.length;
        System.out.println("The Average daily-high temperature for week 1 is " + average  +".");
        int high = 0;
        String highday ="";
        for (int index = 0; index < weekone.length; index++) {
            if (weekone[index] > high) {
                high = weekone[index];
                highday = day[index];
            }
        }
        System.out.println("In week 1,"  + highday + " was the warmest at " + high);
        return high;

    }
    public static void secondTemps(int weektwo[]) {

        for (int index = 0; index < 7; index++) {
        }

        int sum = 0;
        for (int index = 0; index < weektwo.length; index++) {
            sum += weektwo[index];
        }

        int average = sum /weektwo.length;
        System.out.println("The Average daily-high for week 2 is " + average + ".");
        int high = 0;
        String highday = "";
        for (int index = 0; index < weektwo.length; index++) {
            if (weektwo[index] > high)
            high = weektwo[index];
            highday = day[index];
        }
        System.out.print("In week 2, " + highday + " was the warmest at " +high);

    }
}






