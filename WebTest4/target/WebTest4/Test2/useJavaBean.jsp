<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="user" class="pojo.User" scope="page"></jsp:useBean>

    <c:set value="张三" target="${user}" property="name"></c:set>
    <c:set value="123456" target="${user}" property="password"></c:set>

    <div>
        <%-- JSTL核心标签获取输出JavaBean的属性 --%>
        JSTL核心标签获取输出JavaBean的属性<br/>
        姓名：<c:out value="${user.name}"></c:out><br/>
        密码：<c:out value="${user.password}"></c:out><br/>
        <%-- EL表达式获取输出JavaBean的属性 --%>
        EL表达式获取输出JavaBean的属性<br/>
        姓名：${user.name}<br/>
        密码：${user.password}
    </div>
</body>
</html>
