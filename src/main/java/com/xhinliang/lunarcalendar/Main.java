package com.xhinliang.lunarcalendar;

/**
 * @author xhinliang <xhinliang@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        // Basic
        LunarCalendar lunarCalender = LunarCalendar.obtainCalendar(2016, 1, 4);
        System.out.println(lunarCalender.getDay());
        System.out.println(lunarCalender.getFullLunarStr());
        println();

        // Month of Gregorian
        println("Month of Gregorian");
        LunarCalendar[][] month = LunarCalendar.obtainCalendar(2016, 2);
        for (LunarCalendar[] weeks : month) {
            for (LunarCalendar day : weeks) {
                if (day == null) {
                    printSpaceX2();
                    continue;
                }
                print(String.format("%2d", day.getDay()));
            }
            System.out.println();
        }

        // Month of Lunar
        println("Month of Lunar");
        for (LunarCalendar[] weeks : month) {
            for (LunarCalendar day : weeks) {
                if (day == null) {
                    printSpaceX3();
                    continue;
                }
                print(String.format("%s", day.getLunarDay()));
            }
            System.out.println();
        }

        // SubTitle of Month
        println("SubTitle of Month");
        for (LunarCalendar[] weeks : month) {
            for (LunarCalendar day : weeks) {
                if (day == null) {
                    printSpaceX3();
                    continue;
                }
                print(String.format("%s", day.getSubTitle()));
            }
            System.out.println();
        }

        // Festival
        println("Festival");
        LunarCalendar festivalDay = LunarCalendar.obtainCalendar(2016, 10, 1);
        for (String festival : festivalDay.getFestivals().getSet())
            print(festival);
        println();
        println();

        // Lunar
        println("Lunar");
        println(month[0][4].getFullLunarStr());
        println();


        // Field
        println("Field");
        println(month[1][1].toString());
        println();
    }

    private static void println(String str) {
        System.out.println(str);
    }

    private static void println() {
        System.out.println();
    }

    private static void printSpaceX3() {
        print("   ");
    }

    private static void printSpaceX2() {
        print("  ");
    }

    private static void print(String str) {
        System.out.print(str);
        System.out.print(' ');
    }

}
