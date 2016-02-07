package xhinliang;


import xhinliang.lunarcalendar.LunarCalendar;

/**
 * Sample for Usage
 *
 * @author XhinLiang 2016-02-06
 */
public class Main {
    public static void main(String[] args) {
        // Basic
        println("Basic");
        LunarCalendar lunarCalender = LunarCalendar.getInstance(2016, 2, 8);
        System.out.println(lunarCalender.getLunar());
        println();

        // Month of Gregorian
        println("Month of Gregorian");
        LunarCalendar[][] month = LunarCalendar.getInstanceMonth(2016, 2);
        for (LunarCalendar[] aMonth2 : month) {
            for (LunarCalendar anAMonth2 : aMonth2) {
                if (anAMonth2 == null) {
                    printSpaceX2();
                    continue;
                }
                print(String.format("%2d", anAMonth2.getDay()));
            }
            System.out.println();
        }

        // Month of Lunar
        println("Month of Lunar");
        for (LunarCalendar[] aMonth1 : month) {
            for (LunarCalendar anAMonth1 : aMonth1) {
                if (anAMonth1 == null) {
                    printSpaceX3();
                    continue;
                }
                print(String.format("%s", anAMonth1.getLunarDay()));
            }
            System.out.println();
        }

        // SubTitle of Month
        println("SubTitle of Month");
        for (LunarCalendar[] aMonth : month) {
            for (LunarCalendar anAMonth : aMonth) {
                if (anAMonth == null) {
                    printSpaceX3();
                    continue;
                }
                print(String.format("%s", anAMonth.getSubTitle()));
            }
            System.out.println();
        }

        // Festival
        println("Festival");
        LunarCalendar festivalDay = LunarCalendar.getInstance(2016, 10, 1);
        //noinspection Convert2streamapi
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
