<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示用户信息</title>
</head>
<body>
    <jsp:useBean id="user" scope="page" class="pojo.User"></jsp:useBean>
    <jsp:useBean id="encoding" scope="page" class="pojo.Encoding"></jsp:useBean>

    <jsp:setProperty name="user" property="name" param="username"/>
    <jsp:setProperty name="user" property="password" param="userpassword"/>

    <%
        if(user.getName() == null || user.getPassword() == null){
            response.getWriter().println("用户名或密码为空");
            response.setHeader("Refresh", "2;URL=" + request.getContextPath() + "/Test6/modifyinfo.jsp");
        }
    %>

    <c:if test="${user.name != null && user.password != null}">
        <div>
            用户名：<%= encoding.encoded(user.getName()) %><br/>
            用户密码：<%= encoding.encoded(user.getPassword()) %>
        </div>
    </c:if>
</body>
</html>
