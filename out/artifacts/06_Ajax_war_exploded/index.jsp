<%--
  Created by IntelliJ IDEA.
  User: 64169
  Date: 2021/7/8
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="statics/js/jquery-3.6.0.js"></script>
    <script>
      function a() {
        $.post({
          url: "${pageContext.request.contextPath}/testa1",
          data:{"name": $("#username").val()},
          success: function (data) {
            console.log("data=" + data);
          },error: function (data) {
            alert(data);
          }
        })
      }
    </script>
  </head>
  <body>
  用户名：<input type="text" id="username" onblur="a()">
<%--  <iframe id="iframe1" height="800px" width="100%" onblur="a1()">--%>
<%--  </iframe>--%>
  </body>
</html>
