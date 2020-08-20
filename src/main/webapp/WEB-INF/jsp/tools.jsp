<%--
  Created by IntelliJ IDEA.
  User: K550V
  Date: 2020/6/18
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能测试页面</title>
</head>
<body>
------------------------传参测试--------------------------------------------<<br>
<form action="test" >
    <input type="text" name="name"><br>
    <input type="text" name="pwd">
    <input type="submit" value="提交">
</form>
-----------------------文件上传-----------------------------------------<br>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="multipartFile">
    <input type="submit" value="上传">
</form>
------------------------文件下载-----------------------------------------<br>
<a href="download" >点击下载文件</a><br>

-----------------------日期格式转换--------------------------------------<br>
<form action="date" method="post">
    姓名:<input type="text" name="name"><br>
    生日:<input type="date" name="bir">
    <input type="submit" value="提交">
</form>

--------------------------动态SQL-----------------------------------------
<form action="query">
    编号:<input type="text" name="id" placeholder="选填"><br>
    姓名:<input type="text" name="name" placeholder="选填">
    <input type="submit" value="查询">
</form>

<form action="update">
    编号:<input type="text" name="id" placeholder="必填"><br>
    姓名:<input type="text" name="name" placeholder="选填"><br>
    密码:<input type="text" name="password" placeholder="选填"><br>
    邮箱:<input type="email" name="email" placeholder="选填">
    <input type="submit" value="修改">
</form>

<form action="insert">
    姓名:<input type="text" name="name"placeholder="选填"><br>
    密码:<input type="text" name="password" placeholder="选填"><br>
    邮箱:<input type="email" name="email" placeholder="选填">
    <input type="submit" value="添加">
</form>

<form action="delete">
    编号:<input type="text" name="id" placeholder="选填"><br>
    姓名:<input type="text" name="name"placeholder="选填">
    <input type="submit" value="删除">
</form>
</body>
</html>
