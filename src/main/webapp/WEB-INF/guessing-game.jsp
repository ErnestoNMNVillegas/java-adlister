<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/5/23
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>

<%--Note:  All work below from Walk-thru--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<h1>Pick a Number</h1>
<form action="${pageContext.request.contextPath}/guess" method="post">
  <button name="guess" value="1">1</button>
  <button name="guess" value="2">2</button>
  <button name="guess" value="3">3</button>
</form>
test
</body>
</html>
