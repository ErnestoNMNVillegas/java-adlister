<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/2/23
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login Form</h1>
    <form action="login.jsp" method="POST">
        <label id="username">
        Enter username :<input type="text" name="username">
        </label>
        <label id="password">
        Enter password :<input type="password" name="password">
        <input type="submit" value="Login">
        </label>
    </form>
</body>
</html>
