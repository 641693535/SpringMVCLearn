<%--
  Created by IntelliJ IDEA.
  User: 64169
  Date: 2021/7/8
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1><br/>
<form action="${pageContext.request.contextPath}/user/Login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password" >
    <input type="submit" value="提交">
</form>
</body>
</html>
