package com.xhinliang.lunarcalendar;

/**
 * Created by io.xhinliang on 16-2-6.
 *
 * @author XhinLiang 2016-02-06
 */
@SuppressWarnings("WeakerAccess")
public class Lunar extends Gregorian {
    public boolean isLeap;

    Lunar(int y, int m, int d) {
        super(y, m, d);
    }

    @Override
    public String toString() {
        return "Lunar{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
