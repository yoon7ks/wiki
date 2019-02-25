<%--
  Created by IntelliJ IDEA.
  User: yjks
  Date: 2019-02-23
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${spittlesList}" var="spittle">
        <li id="spittle_<c:out value="spittle.id"/>">
            <div class="spittleMessage">
                <c:out value="${spittle.message}" />
            </div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                <span class="spittleLocation">
                    (<c:out value="${spittle.latitue}" />,
                    <c:out value="${spittle.longitude}" />
                </span>
            </div>
        </li>
    </c:forEach>
</body>
</html>
