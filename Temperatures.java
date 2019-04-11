import java.lang.System;

public class Temperatures {

    public static void main(String[] args) {
        System.out.println("Temperature Calculator");
        int temps[][] = {{68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}};

        System.out.println("The data provided are:");

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Based on the data, the following are the average temperatures for the week.");
        System.out.println();
        avgDay(temps);
        System.out.println(" ");
        avgTime(temps);
        System.out.println();
        System.out.println("The final average temperature for the week was:");
        System.out.println(avgWeek(temps));
    }

        public static void avgTime(int [][] temps) {

            int averageTime;
            for (int row = 0; row < 4; row++) {
            String[] times = {"7 AM:", "3 PM:", "7 PM:", "3 AM:"};
            System.out.print(times[row]);
                int sumOfRow = 0;
                for (int column = 0; column < 7; column++) {
                    sumOfRow += temps[row][column];
                }
                averageTime = sumOfRow / 7;
                System.out.println(averageTime);
            }

        }

        public static void avgDay(int [][] temps) {

            int averageDay;
            for (int column = 0; column < 7; column++) {
                String[] days = {"Sun:","Mon:", "Tues:", "Wed", "Thurs", "Fri","Sat","Sun",};
                System.out.print(days[column]);
                int sumOfColumn = 0;
                for (int row = 0; row < 4; row++) {
                    sumOfColumn += temps[row][column];
                }
                averageDay = sumOfColumn / 4;
                System.out.println(averageDay);
            }
        }
        
        public static int avgWeek(int [][] temps) {
            int weekSum = 0;
            int a = 0;
            for (int column = 0; column < 7; column++) {
                for (int row = 0; row < temps.length; row++) {
                    weekSum = weekSum + temps[row][column];
                    a++;
                }
            }
            return weekSum/(a);
        }
    }








