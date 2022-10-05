<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <div>
        欢迎${user}！您已登录<a href="${pageContext.request.contextPath}/logout">退出</a>
    </div>
</body>
</html>
