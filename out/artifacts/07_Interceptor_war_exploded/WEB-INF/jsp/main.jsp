<%--
  Created by IntelliJ IDEA.
  User: 64169
  Date: 2021/7/8
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<h1>
    前用户为：${username}
    <a href="${pageContext.request.contextPath}/user/goOut">注销</a>
</h1>
</body>
</html>
