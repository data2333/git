<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/23
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--快速开发出表单页面--%>
<form:form action="emp" method="post">
    LastName:<form:input path="lastName"/>
    Email:<form:input path="email"/>
    <%
        Map<String,String> genders=new HashMap<>();
        genders.put("1","male");
        genders.put("0","Female");
        request.setAttribute("genders",genders);
    %>
    Gender:<form:radiobuttons path="gender" items="${genders}"/>
    Department:<form:select path="department" items="${departments}" itemLabel="departmentName" itemValue="id"/>
</form:form>
</body>
</html>
