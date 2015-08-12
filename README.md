#1、效果图
![效果图](http://img.blog.csdn.net/20150812231418851)

#2、实现简介
##1、布局结构
**(1)、项目结构**：

![代码结构图](http://img.blog.csdn.net/20150812232528995)

**(2)、代码结构：**

一个主Activity,一个PullToZoomScrollView(即自定义的ScrollView)，还有一个工具类（可以忽略）

**(3)、布局结构**

**主布局**：
分为两块，一个为TopBar，即标题栏（这个不用说了），另外一个是自定义的ScrollView，即PullToZoomScrollView。既然是ScrollView,它也是ViewGroop，所以它内部也可以包含多个布局。

**PullToZoomScrollView布局**：
也包含两块，一个是上面要下拉可以变大的布局(即含背景图的布局)，一个就是下面的文字显示布局。我这里是分别写两个layout布局，在主布局里include进去的。
