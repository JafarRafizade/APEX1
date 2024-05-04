package methodTasks;

import java.util.Scanner;

public class TimeCalculator {
    public String calculateDifference() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter beginning time");
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        System.out.println("Enter ending time");
        int hour2 = scanner.nextInt();
        int minute2= scanner.nextInt();
        boolean isTrue = false;
        int minuteDif = 0;
        int hourDif = 0;
do {


    if (hour1 > hour2 && minute1 < minute2) {
        minuteDif = 60 - (minute2 - minute1);
        hourDif = (hour1 - 1) - hour2;


    } else if (hour1 > hour2 && minute1 > minute2) {
        minuteDif = minute1 - minute2;
        hourDif = hour1 - hour2;


    } else if (hour1 < hour2 && minute1 > minute2) {
        minuteDif = 60 - (minute1 - minute2);
        hourDif = (hour2 - 1) - hour1;

    } else if (hour1 < hour2 && minute1 < minute2) {
        minuteDif = minute2 - minute1;
        hourDif = hour2 - hour1;

    }
    if ((hour1 >= 24 || hour2 >= 24) && (minute1 >= 60 || minute2 >= 60)) {
        return "Invalid time";
    }

    return hourDif + "hours" + " " + minuteDif + "minutes";
}while (isTrue );



    }
}
