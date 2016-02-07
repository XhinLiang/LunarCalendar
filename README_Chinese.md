# LunarCalendar
**[English](https://github.com/XhinLiang/LunarCalendar)**

## 介绍
**一个能够简化农历和节日操作的库**

**兼备易用与高效**

## 导入

### Gradle
**1. 在根目录的 build.gradle 添加**

```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
**2. 添加依赖**

```
dependencies {
	compile 'com.github.XhinLiang:LunarCalendar:1.0.4'
}
```
### Maven
**1. 添加 JitPack 仓库**
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
**2. 添加依赖**

```
<dependency>
	<groupId>com.github.XhinLiang</groupId>
	<artifactId>LunarCalendar</artifactId>
	<version>1.0.4</version>
</dependency>
```

### Jar
**1. 下载 [JAR](https://github.com/XhinLiang/LunarCalendar/releases/download/1.0.4/lunar_calender_1_0_4.jar) 文件**

**2. 添加依赖**

## 示例
- **获取单天**
```
LunarCalendar lunarCalender = LunarCalendar.getInstance(2016, 2, 8);
System.out.println(lunarCalender.getLunar());
```

- **获取一个月**
```
// LunarCalender[6][7], 表示这个月的星期和星期里的天
// 就像我们使用的月历一样
LunarCalendar[][] month = LunarCalendar.getInstanceMonth(2016, 2);
for (LunarCalendar[] weeks : month) {
    for (LunarCalendar day : weeks) {
        if (day == null) {
            printSpaceX2();
            continue;
        }
        print(String.format("%2d", anAMonth2.getDay()));
    }
    System.out.println();
}

```

## 使用
- 在 **sample** 中找到示例代码
- 在 **根目录** 找到 **JavaDoc**

## 更多
- XhinLiang@gmail.com
- [Blog](http://xhinliang.github.io)

## 感谢
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


