# LunarCalendar
[![Release](https://jitpack.io/v/XhinLiang/LunarCalendar.svg)](https://jitpack.io/#XhinLiang/LunarCalendar)
[![Release](https://img.shields.io/github/release/XhinLiang/LunarCalendar.svg)](https://jitpack.io/#XhinLiang/LunarCalendar)

**[中文](https://github.com/XhinLiang/LunarCalendar/blob/master/README-CN.md)**

## Introduce
**Calendar for Chinese Lunar.**

**Easy to use and high performance.**

## Import

### Gradle
```
dependencies {
    compile 'com.xhinliang:LunarCalendar:4.0.6'
}
```
### Maven
```
<dependency>
    <groupId>com.xhinliang</groupId>
    <artifactId>LunarCalendar</artifactId>
    <version>4.0.6</version>
</dependency>
```

## Sample

#### obtain single day
- **Code**
```
LunarCalendar lunarCalender = LunarCalendar.obtainCalendar(2016, 2, 8);
System.out.println(lunarCalender.getLunar());
System.out.println(lunarCalender.getFullLunarStr());
```
- **Output**
```
Lunar{year=2016, month=1, day=1}
二零一六年正月初一
```

#### obtain a month by weeks
- **Code**
```
// LunarCalender[6][7], means the weeks of this month and the days of the weeks
// Just like the calender we use daily.
LunarCalendar[][] month = LunarCalendar.obtainCalendar(2016, 2);
for (LunarCalendar[] week : month) {
    for (LunarCalendar day : week) {
        if (day == null) {
            System.out.print('  ');
            continue;
        }
        System.out.println(String.format("%s", day.getLunarDay()));
    }
    System.out.println();
}
```
- **Output**
```
    廿三 廿四 廿五 廿六 廿七 廿八
廿九 初一 初二 初三 初四 初五 初六
初七 初八 初九 初十 十一 十二 十三
十四 十五 十六 十七 十八 十九 廿十
廿一 廿二
```


## Usage
- View the sample in **Main**
- View the doc in **root**

## More
- XhinLiang@gmail.com
- [Blog](https://xhinliang.com)

## Thanks
- [DatePicker](https://github.com/AigeStudio/DatePicker)
- [AigeStudio](http://blog.csdn.net/aigestudio)

## License

    Copyright 2016 XhinLiang

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


