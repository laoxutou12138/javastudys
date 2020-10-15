# <font color=#2F4F4F size=7 face="黑体">我的简历</font>

<img src="https://i.loli.net/2020/10/13/r9GZIBhKzdVALxe.jpg" alt="image-20201014173435678 weith" style="zoom: 15%; float: left;"  />      **姓名 ：徐天锡**

​      **手&ensp;机&ensp;号： 158 0528 6949&emsp;&emsp;                 邮&emsp;&emsp;箱：2513539241@qq.com**      

​      **证&emsp;&emsp;书：公共英语三级、计算机二级    &emsp;&emsp; 实习经验：1年**

​      **GitHub：https://github.com/laoxutou12138**

​      **毕业学校：&ensp;镇江高等职业技术学校**

## 实习经历
**公司：江苏鸿剑科技有限公司&emsp;&emsp;职位：安卓开发工程师&emsp;&emsp;时间：2019.7.1-2019-12.1**
<br/>**项目名称：陈静采耳APP**
<br/>**项目简介：用户和技师可以使用此APP进行不同操作**
<br/>**主要工作：**

 - 需求说明书

 - 实现页面交互

 - 调用API实现数据交互

   

## 部分项目经历

### 1.装备维修中心APP

- 部分项目截图
<div style="float:left;padding-left:10%">
    <img src="https://i.loli.net/2020/10/14/2WYjabz4vkNUZLF.png" alt="image-20201014101617599" style="zoom: 90%;" />
</div>
<div style="float:left">
    <img src="https://i.loli.net/2020/10/14/v7LE9uqlCxkGKFj.png" alt="image-20201014101617599" style="zoom: 90%;" />
</div>
<div style="float:left">
    <img src="https://i.loli.net/2020/10/14/VcvgwA2mSyTCGOJ.png" alt="image-20201014101617599" style="zoom: 90%;" />
</div>






















> 以上截图分别为登录页面、报修人员列表页面和报修单详细页面

- 核心代码

  ``` C#
  public static string HttpPost(string url, string body)
          {
              Encoding encoding = Encoding.UTF8;
              HttpWebRequest request = (HttpWebRequest)WebRequest.Create(url);
              request.Method = "POST";
              request.Accept = "text/html, application/xhtml+xml, */*";
              request.ContentType = "application/json";
  
              byte[] buffer = encoding.GetBytes(body);
              request.ContentLength = buffer.Length;
              request.GetRequestStream().Write(buffer, 0, buffer.Length);
              HttpWebResponse response = (HttpWebResponse)request.GetResponse();
              using (StreamReader reader = new StreamReader(response.GetResponseStream(), Encoding.UTF8))
              {
                  return reader.ReadToEnd();
              }
          }
  Get使用方法如下：
  public static string HttpGet(string url)
          {
              Encoding encoding = Encoding.UTF8;
              HttpWebRequest request = (HttpWebRequest)WebRequest.Create(url);
              request.Method = "GET";
              request.Accept = "text/html, application/xhtml+xml, */*";
              request.ContentType = "application/json";
              HttpWebResponse response = (HttpWebResponse)request.GetResponse();
              using (StreamReader reader = new StreamReader(response.GetResponseStream(), Encoding.UTF8))
              {
                  return reader.ReadToEnd();
              }
          }
  ```

  > 使用WebApi进行数据传输

- 使用软件及技术

  1.软件介绍
  ![image-20201014105125085](https://i.loli.net/2020/10/14/oGdOLECqzPepWX8.png)

Visual Studio 2019为微软公司于2019年更新的Visual Studio最新版本，其中改进了 C++ 文件的 IntelliSense 性能，使用多个常用仿真程序进行本地开发，简化了解决方案资源管理器中的测试访问，IDE 中的 Git 管理和存储库创建，Kubernetes 支持现在包含在 Microsoft Azure 工作负载中，Visual Studio 2019支持C语言，C#等多种语言的编写，同时Visual Studio 2019 界面能将近期运行项目以列表形式显示。

​      2.Xamarin介绍

![image-20201014105732440](https://i.loli.net/2020/10/14/PsndqDeWEx1Gmpa.png)

Xamarin.Forms是一个开源UI框架。Xamarin.Forms允许开发人员从单个共享代码库构建Android，iOS和Windows应用程序。

使用Xamarin需要安装Visual Studio 2017或更新版本。安装步骤如下：

1.下载Visual Studio 2017或更新版本安装器；

2.打开Visual Studio配置页面，勾选“使用.NET的移动开发”选项



## 技能清单

以下均为我熟练使用的技能：

- 编程语言：Java、C、C#
- 安卓开发：熟悉安卓UI设计、布局、自定义控件开发
- Xamarin.Forms跨平台开发
- HTML5+CSS3

以下是我接触并了解的技能：

&emsp;&emsp;&emsp;php、python、Sql Server等等



## Java学习计划

- 第一阶段：复习C#，熟悉JAVA语法，复习面向对象变成。
- 第二阶段：学习数据流输入输出
- 第三阶段：学习网络开发相关知识
- 第四阶段：学习JavaWeb
- 第五阶段：尝试自己搭建博客