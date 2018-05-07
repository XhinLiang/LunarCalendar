package com.xhinliang.lunarcalendar;

/**
 * @author xhinliang
 */
@SuppressWarnings("WeakerAccess")
public class Gregorian {
    public int year;
    public int month;
    public int day;

    Gregorian(int year, int month, int day) {
        checkYear(year);
        init(year, month, day);
    }

    void reset(int year, int month, int day) {
        checkYear(year);
        init(year, month, day);
    }

    private void init(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private void checkYear(int year) {
        if (year < 1900 || year > 2100) {
            throw new RuntimeException("Year should be between 1900 and 2100");
        }
    }

    @Override
    public String toString() {
        return "Gregorian{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
