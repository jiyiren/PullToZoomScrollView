## 效果图

![效果图](http://img.godjiyi.cn/GIF2.gif)

## 实现简介

* 说明地址：[Android-Scrollview 下拉变大说明](http://jiyiren.github.io/2015/08/13/android-scrollview/)
* 项目结构

	![代码结构图](http://img.godjiyi.cn/csdnblogjiegou.png)

* 代码结构

	* 一个主 `Activity` ,
	*  一个 `PullToZoomScrollView` ( 即自定义的 ScrollView )，
	*  还有一个工具类（可以忽略）

## 布局结构

* 主布局

	分为两块，一个为TopBar，即标题栏（这个不用说了），另外一个是自定义的ScrollView，即PullToZoomScrollView。既然是ScrollView,它也是ViewGroop，所以它内部也可以包含多个布局。

* PullToZoomScrollView 布局

	也包含两块，一个是上面要下拉可以变大的布局(即含背景图的布局)，一个就是下面的文字显示布局。我这里是分别写两个layout布局，在主布局里include进去的。
