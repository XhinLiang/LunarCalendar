# LunarCalendar
**[中文](https://github.com/XhinLiang/LunarCalendar/blob/master/README_Chinese.md)**

## Introduce
**Calendar for Chinese Lunar.**

**Easy to use and high performance.**

## Import

### Gradle
**1. Add it in your root build.gradle at the end of repositories**

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
**2. Add the dependency**

```
dependencies {
	compile 'com.github.XhinLiang:LunarCalendar:1.2.0'
}
```
### Maven
**1. Add the JitPack repository to your build file**
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
**2. Add the dependency**

```
<dependency>
	<groupId>com.github.XhinLiang</groupId>
	<artifactId>LunarCalendar</artifactId>
	<version>1.2.0</version>
</dependency>
```

### Jar
**1. Download the [JAR](https://github.com/XhinLiang/LunarCalendar/releases/download/1.2.0/LunarCalendar-all-1.2.0.jar).**

**2. Add Dependency.**

## Sample

#### obtain single day
- **Code**
```
LunarCalendar lunarCalender = LunarCalendar.getInstance(2016, 2, 8);
System.out.println(lunarCalender.getLunar());
System.out.println(lunarCalender.getLunar());
```
- **Output**
```
Basic
Lunar{year=2016, month=1, day=1}
二零一六年正月初一
```

#### obtain a month by weeks
- **Code**
```
// LunarCalender[6][7], means the weeks of this month and the days of the weeks
// Just like the calender we use daily.
LunarCalendar[][] month = LunarCalendar.getInstanceMonth(2016, 2);
for (LunarCalendar[] week : month) {
    for (LunarCalendar day : week) {
        if (day == null) {
            System.out.print('  ');
            continue;
        }
        System.out.print(String.format("%2d", day.getDay()));
    }
    System.out.println();
}
```
- **Output**
```
Month of Lunar
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
- [Blog](http://xhinliang.github.io)

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


