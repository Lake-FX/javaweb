<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/13
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>welcome to register</title>
    <style>
        div {
            margin: 0 auto;
            height: 500px;
            background-color: #b1c7bc;
        }
    </style>
</head>
<body>
<div>
    <h1>注册用户</h1>
    <form action="urigister" method="post">
        <label>姓名：<input type="text" name="username" placeholder="请输入姓名"></label><br>
        <label>密码：<input type="password" name="password" placeholder="请输入密码"></label><br>
        <input type="submit" value="注册">
    </form>
    <p style="color: red">${error}</p>
</div>

</body>
</html>
