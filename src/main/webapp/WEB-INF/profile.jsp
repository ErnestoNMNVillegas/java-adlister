<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

    <br>
    <c:choose>
        <c:when test="${user}">
            <h1>You are logged in</h1>
        </c:when>
    </c:choose>
    <br>

    <form action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit" class="btn btn-primary btn-block" value="Log Out">
    </form>

</body>
</html>
