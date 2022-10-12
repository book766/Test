<%@ page import="pojo.User" %>
<%@ page import="org.apache.commons.beanutils.BeanUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示用户信息</title>
</head>
<body>
    <%
        User user = new User();

        if(request.getParameter("username") == "" || request.getParameter("userpassword") == ""){
            response.getWriter().println("用户名或密码为空");
            response.setHeader("Refresh", "2;URL=" + request.getContextPath() + "/Test4/modifyinfo.jsp");
        } else {
            BeanUtils.setProperty(user, "name", request.getParameter("username"));
            BeanUtils.setProperty(user, "password", request.getParameter("userpassword"));

            pageContext.setAttribute("user", user);
        }
    %>

    <c:if test="${user.name != null && user.password != null}">
        <div>
            用户名：${user.name}<br/>
            用户密码：${user.password}
        </div>
    </c:if>
</body>
</html>