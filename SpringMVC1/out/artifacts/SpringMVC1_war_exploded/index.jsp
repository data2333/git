<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/17
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="/testPathVariable/testRequestParam?username=FUCK&age=11">hello</a>
<form action="/testPathVariable/1" method="post">
    <input type="hidden" name="method" value="DELETE">
    <input type="submit" value="DELETE">
</form>
<form action="/testPathVariable/1" method="get">
    <input type="hidden" name="method" value="PUT">
    <input type="submit" value="GET">
</form>
<form action="/testPathVariable/1" method="post">
    <input type="submit" value="POST">
</form>
<a href="/testPathVariable/1">Test Rest Get</a>
<a href="/testPathVariable/testRequestHeader">testRequestHeader</a>
<a href="/testPathVariable/testCookieValue">testCookieValue</a>

<form action="/testPathVariable/testPojo" method="post">
    username:<input type="text" name="username">
    <br>
    password:<input type="password" name="password">
    <br>
    email:<input type="text" name="email">
    <br>
    <%--age:<input type="text" name="age">--%>
    <br>
    <%--city:<input type="text" name="address.city">--%>
    <br>
    province:<input type="text" name="address.province">
    <br>
    <input type="submit" value="提交">
</form>
<a href="/testPathVariable/testPojo">testPojo</a>
<a href="/testPathVariable/testServlet">testServlet</a>
<br>
<a href="/testPathVariable/testModelAndView">testModelAndView</a>
<a href="/testPathVariable/testMap">testMap</a>
<br>
<a href="/testPathVariable/testSession">testSession</a>
<form action="/testPathVariable/testModelAttribute" method="post">
    <input type="text" name="id" value="1">
    username:<input type="text" name="username" value="Tom">
    <br>
    email:<input type="text" name="email" value="tom@qq.com">
    <br>
    age:<input type="text" name="age" value="14">
    <br>
    <input type="submit" value="Submit">
</form>
<br>
<a href="/testPathVariable/testView">testView</a>
<br>
<a href="/testPathVariable/testRedirect">testRedirect</a>
<a href="emp">Add new Employee</a>
<a href="emps">List All Employees</a>
</body>
</html>
