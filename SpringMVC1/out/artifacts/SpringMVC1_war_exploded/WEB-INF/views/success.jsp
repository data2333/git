<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/18
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
time:${requestScope.time}
name:${requestScope.names}
<br>
Request user:${requestScope.school}
<br>
session user:${sessionScope.school}
<br>
abc user:${requestScope.abc}
<br>
</body>
</html>
