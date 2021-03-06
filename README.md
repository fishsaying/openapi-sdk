FishSaying OpenAPI SDK for Java
=
The FishSaying OpenAPI SDK for Java enables Java developers to easily work with FishSaying OpenAPI. You can get started in minutes using Maven,Gradle or by downloading a [single zip file](https://codeload.github.com/fishsaying/openapi-sdk/zip/master).

SDK下载(如何获得SDK)
===
maven工程
----
添加(添加maven库)：
```
<repositories>
	<repository>
		<id>nexus-repos</id>
		<name>Team Nexus Repository</name>
		<url>http://maven.fishsaying.com/nexus/content/groups/public/</url>
	</repository>
</repositories>
```
到项目pom.xml中

gradle工程
----
添加(添加依赖库)：
```
repositories {
	// 中央仓库
	mavenCentral()
	// 本地私服
    maven {
      url "http://maven.fishsaying.com/nexus/content/groups/public/"
    }
}
```
到项目到build.gradle中 

简介
===

```
fishsaying openApi SDK适用于 JDK 6 及以上版本
本文档主要介绍 此SDK 的安装、使用及注意事项；
并且假设您已经开通了鱼说[授权]服务，并创建了 clientId和clientSecret。
```
-----

安装
=

环境准备
===
 * 适用于JDK 6及以上版本
 * Maven or Gradle

安装方式
===
maven方式
---
将下面代码加入到maven项目的dependencies块中

```
<dependency>
  <groupId>com.fishsaying.oauth</groupId>
  <artifactId>fs-sdk-oauth</artifactId>
  <version>1.0.0</version>
</dependency>
```    

gradle方式
---
将下面代码加入到gradle项目下build.gradle的dependencies块中

```
compile com.fishsaying.oauth:fs-sdk-oauth:1.0.0
```

Build
===
Once you check out the code from GitHub, you can build it using Gradle. Use the following command to build:

```
gradle build -x test
```


示例程序
===

FishSaying OpenAPI SDK提供示例程序，方便用户参考或直接使用。您可以通过以下方式获取示例程序：

github查看下载，参考[FishSaying OpenAPI SDK](https://github.com/fishsaying/openapi-sdk) 下的src/samples为示例程序，
可以快速使用。

-----
示例包括以下内容：

| 示例代码       |   示例内容     | 
| ------------- |:-------------:|
| GetAccessTokenSample| 获取accessToken|
| StoryInfoSample     | 查询故事详情|
| StorySearchGeoSample| 根据地理位置查询某范围的故事|
| StorySearchKeywordSample|关键字查询故事列表|
| ScenicInfoSample     | 查询景区详情|
| ScenicSearchGeoSample| 根据地理位置查询某范围的景区|
| ScenicSearchKeywordSample|关键字查询景区列表|
| FigureSearchKeywordSample|关键字查询历史人物列表|
| FigureInfoSample     | 查询历史人物详情|
| StoryUnderScenicSample|景区相关的故事|
| StoryUnderFigureSample|历史人物相关的故事|

-----

API文档
===
更多关于API的使用，请移步至[openapi](https://github.com/fishsaying/openapi)

----

License
===

licensed under the [Apache License 2.0](https://www.apache.org/licenses/)

