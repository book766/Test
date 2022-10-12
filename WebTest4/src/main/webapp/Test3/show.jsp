<%@ page import="pojo.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三","123"));
        userList.add(new User("李四","456"));
        userList.add(new User("王五","789"));
    %>

    <%-- 迭代特定次数 --%>
    <div>
        <span>迭代特定次数</span><br/>
    <c:forEach var="i" begin="1" end="50" step="3" varStatus="status">
        ${status.count}:${i}<br/>
    </c:forEach>
    </div>
    <hr/>
    <%-- 迭代对象集合内容 --%>
    <div>
        <span>迭代对象集合内容</span><br/>
        <c:forEach var="user" items="<%=userList%>" varStatus="status">
            ${status.count}:${user.name}-${user.password}<br/>
        </c:forEach>
    </div>
</body>
</html>