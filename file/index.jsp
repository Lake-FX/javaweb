<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/13
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Welcome to login</title>
</head>
<style>
    div {
        margin: 0 auto;
        height: 500px;
        background-color: #b1c7bc;
    }
</style>
<body>
<div>
    <h1>xxxx登陆界面</h1>
    <form action="login" method="post">
        <label>姓名：<input type="text" name="username" value="${username}" placeholder="请输入姓名"></label><br>
        <label>密码：<input type="password" name="password" placeholder="请输入密码"></label><br>
        <input type="submit" value="登录">
        <input type="button" onclick="register()" value="注册">
    </form>
</div>

<p style="color: red">${error}</p>
<script>
    function register() {
        window.location.href="register.jsp";
    }
</script>
</body>
</html>
