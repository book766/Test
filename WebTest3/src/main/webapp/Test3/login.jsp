<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <%
        String session_token = new Date().getTime() + Math.random() + "";
        request.getSession().setAttribute("session_token",session_token);
    %>

    <div>
        <form action="${pageContext.request.contextPath}/userinfo" method="post">
            <input type="hidden" name="form_token" value="${session_token}">
            用户名：<input type="text" name="username" >
            <input type="submit" value="提交" align="center">
        </form>
    </div>
</body>
</html>
