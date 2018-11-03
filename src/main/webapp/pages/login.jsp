<%--
  Created by IntelliJ IDEA.
  User: lijiwei
  Date: 18/10/23
  Time: 08:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/login" method="post">
        <input type="text" name="username" placeholder="用户名"><br/>
        <input type="password" name="password" placeholder="密码"><br/>
        <input type="submit" value="提交">
    </form>
${msg}



</body>
</html>
