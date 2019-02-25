<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yjks
  Date: 2019-02-23
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sprittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resource/style.css"/>" >
</head>
<body>
    <h1>Welcome to Spittr</h1>

    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spittles/register" />">Register</a>
</body>
</html>
