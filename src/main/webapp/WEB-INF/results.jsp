<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/5/23
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>

<%--Note:  All work below from Walk-thru--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final Result</title>
</head>
<body>
    <c:choose>
      <c:when test="${result}">
        <h1>You win!</h1>
      </c:when>
      <c:otherwise>
        <h1>You lose!</h1>
      </c:otherwise>
    </c:choose>
    <a href="/guess">Play Again!</a>
</body>
</html>
