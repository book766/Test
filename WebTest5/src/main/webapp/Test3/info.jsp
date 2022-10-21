<%@ page import="Test3.User" %>
<%@ page import="Test3.UserList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <%
        UserList userlist = (UserList)application.getAttribute("onlineuserlist");

        List<String> list = userlist.GetUserList();
    %>

    <div class="container mt-3 w-25">
        <div class="alert alert-info text-center">
            <% User current = (User)request.getSession().getAttribute("user"); %>
            当前用户：<%= current.getUsername() %>
        </div>
        <div class="alert alert-info text-center">
            当前在线总人数：<%= userlist.GetUserNum() %>
        </div>
        <div>
            <table class="table table-hover text-center">
                <thead>
                    <tr>
                        <th>当前在线用户列表</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="<%=list%>" varStatus="status">
                        <tr>
                            <td>${status.count}:${user}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div align="center">
            <a href="/WebTest5_war/logout" class="btn btn-info" role="button">退出</a>
        </div>
    </div>
</body>
</html>
