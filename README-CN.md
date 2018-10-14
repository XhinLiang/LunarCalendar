# LunarCalendar
[![Jitpack](https://jitpack.io/v/XhinLiang/LunarCalendar.svg)](https://jitpack.io/#XhinLiang/LunarCalendar)
[![Release](https://img.shields.io/github/release/XhinLiang/LunarCalendar.svg)](https://jitpack.io/#XhinLiang/LunarCalendar)


**[English](https://github.com/XhinLiang/LunarCalendar)**

## 介绍
**一个能够简化农历和节日操作的库**

**兼备易用与高效**

## 导入

### Gradle
```
dependencies {
    compile 'com.xhinliang:LunarCalendar:4.0.4'
}
```
### Maven
```
<dependency>
    <groupId>com.xhinliang</groupId>
    <artifactId>LunarCalendar</artifactId>
    <version>4.0.4</version>
</dependency>
```


## 示例

#### 获取单天
- **代码**
```
LunarCalendar lunarCalender = LunarCalendar.obtainCalendar(2016, 2, 8);
System.out.println(lunarCalender.getLunar());
System.out.println(lunarCalender.getFullLunarStr());
```
- **输出**
```
Basic
Lunar{year=2016, month=1, day=1}
二零一六年正月初一
```

#### 获取一个月
- **代码**
```
// LunarCalender[6][7], 表示这个月的星期和星期里的天
// 就像我们使用的月历一样
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
- **输出**
```
Month of Lunar
    廿三 廿四 廿五 廿六 廿七 廿八
廿九 初一 初二 初三 初四 初五 初六
初七 初八 初九 初十 十一 十二 十三
十四 十五 十六 十七 十八 十九 廿十
廿一 廿二
```

## 使用
- 在 **Main** 中找到示例代码
- 在 **根目录** 找到 **JavaDoc**

## 更多
- XhinLiang@gmail.com
- [Blog](http://xhinliang.github.io)

## 感谢
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


