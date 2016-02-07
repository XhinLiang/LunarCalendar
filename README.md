# LunarCalendar
**[中文看这里](https://github.com/XhinLiang/LunarCalendar/blob/master/README_Chinese.md)**

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
	compile 'com.github.XhinLiang:LunarCalendar:1.0.4'
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
	<version>1.0.4</version>
</dependency>
```

### Jar
**1. Download the [JAR](https://github.com/XhinLiang/LunarCalendar/releases/download/1.0.4/lunar_calender_1_0_4.jar).**

**2. Add Dependency.**

## Sample
- **Obtain LunarCalender by single day**
```
LunarCalendar lunarCalender = LunarCalendar.getInstance(2016, 2, 8);
System.out.println(lunarCalender.getLunar());
```

- **Obtain LunarCalender by month**

```
// LunarCalender[6][7], means that the weeks of this month and the
// days of the weeks.Just like the calendar which we use.
LunarCalendar[][] month = LunarCalendar.getInstanceMonth(2016, 2);
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
```

## Usage
- View the sample in module **sample**
- View the doc in **root**

## More
- XhinLiang@gmail.com
- [Blog](http://xhinliang.github.io)

## Thanks
- [DatePicker](https://github.com/AigeStudio/DatePicker)
- [AigeStudio](http://blog.csdn.net/aigestudio)

## License

    Copyright 2015 XhinLiang

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


