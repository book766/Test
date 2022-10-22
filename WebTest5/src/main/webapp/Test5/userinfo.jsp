<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <jsp:include page="./common/nav.jsp"></jsp:include>

    <div class="container w-25 mt-3">
        <h3 align="center">当前用户信息</h3>
        <ul class="list-group">
            <li class="list-group-item">
                用户id：<c:out value="${pageContext.session.getAttribute(\"user\").user_id}" default="unknown"/>
            </li>
            <li class="list-group-item">
                用户名称：<c:out value="${pageContext.session.getAttribute(\"user\").user_name}" default="unknown"/>
            </li>
            <li class="list-group-item">
                用户角色：<c:out value="${pageContext.session.getAttribute(\"user\").user_role}" default="unknown"/>
            </li>
        </ul>
    </div>
</body>
</html>
