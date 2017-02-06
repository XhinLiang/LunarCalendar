package com.xhinliang.lunarcalendar;

import org.junit.Assert;

/**
 * @author xhinliang xhinliang@gmail.com
 */
public class Test {

    @org.junit.Before
    public void setUp() {
    }

    @org.junit.Test
    public void testNew() {
        // Basic
        LunarCalendar lunarCalender = LunarCalendar.obtainCalendar(2016, 1, 4);
        Assert.assertEquals(lunarCalender.getDay(), 4);
        Assert.assertEquals(lunarCalender.getFullLunarStr(), "二零一五年冬月廿五");

        // Month of Gregorian
        LunarCalendar[][] month = LunarCalendar.obtainCalendar(2016, 2);
        int i = 0;
        for (LunarCalendar[] weeks : month) {
            for (LunarCalendar day : weeks) {
                if (day != null) {
                    Assert.assertEquals(day.getDay(), ++i);
                }
            }
        }

        LunarCalendar festivalDay1 = LunarCalendar.obtainCalendar(2017, 2, 18);
        Assert.assertTrue(festivalDay1.getFestivals().getSet().contains("雨水"));

        LunarCalendar festivalDay = LunarCalendar.obtainCalendar(2017, 10, 1);
        Assert.assertTrue(festivalDay.getFestivals().getSet().contains("国庆节&国际老年人日"));

        // Lunar
        Assert.assertEquals(month[0][4].getFullLunarStr(), "二零一五年腊月廿六");
    }
}
