<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/6/23
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ad Listing</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="product">
        <h2>${ad.title}</h2>
        <p>Price: $ ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
