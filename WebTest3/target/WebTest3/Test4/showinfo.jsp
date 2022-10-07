<%@ page import="java.io.PrintWriter" %>
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
        PrintWriter print = response.getWriter();

        if(request.getParameter("username") == "" || request.getParameter("userpassword") == ""){
            print.println("用户名或密码为空");
            response.setHeader("Refresh", "2;URL=" + request.getContextPath() + "/Test4/modifyinfo.jsp");
        } else {
            BeanUtils.setProperty(user,"name",request.getParameter("username"));
            BeanUtils.setProperty(user,"password",request.getParameter("userpassword"));


            print.print("用户名："+ BeanUtils.getProperty(user,"name") + "<br/>");
            print.print("用户密码："+ BeanUtils.getProperty(user,"password"));
        }
    %>
</body>
</html>
