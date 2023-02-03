<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/3/23
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color JSP</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pickcolor" method="post">
    <label for="pickColor">Enter a Color to Display</label>
    <input type="text" id="pickColor" name="pickColor" required size="80">
    <input type="submit" value="Submit">
</form>

</body>
</html>
