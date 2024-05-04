package Enums;

import java.util.Scanner;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    final int number;

    Months(int number) {
        this.number = number;
    }
    public static void seasons(Months month) {
        switch (month) {
            case DECEMBER,JANUARY,FEBRUARY -> System.out.println("This is a winter month");
            case MARCH,APRIL,MAY -> System.out.println("This is a spring month");
            case JUNE,JULY,AUGUST -> System.out.println("This is a summer month");
            case SEPTEMBER,OCTOBER,NOVEMBER -> System.out.println("This is a autumn month");
        }
    }

    public static void main(String[] args) {
        Months.seasons(DECEMBER);
    }
}
